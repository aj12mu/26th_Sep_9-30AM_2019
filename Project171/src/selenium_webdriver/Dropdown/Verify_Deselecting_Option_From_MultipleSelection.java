package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Deselecting_Option_From_MultipleSelection {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");     //Load webpage
		driver.manage().window().maximize();  //maximize browser window
			
		//By using javascript convert single dropdown option to multiple selection dropdown
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag);
		
		
		
		//decison to Accept condition on multiple selection type
		if(flag==true)
		{
			Select StateDropdown=new Select(driver.findElement(By.id("customState")));
			StateDropdown.deselectAll();  //Deselectio only works on multiple selection dropdown
			StateDropdown.selectByIndex(2);
			StateDropdown.selectByIndex(4);
			StateDropdown.selectByIndex(6);
			
			int Count=StateDropdown.getAllSelectedOptions().size();
			System.out.println("Multiple Selection Count is => "+Count);
			
			
			//Decision statemenet to verify dropdown accept maximum selection equals to 3.
			if(Count==3)
			{
				//Deselect Single option 
				StateDropdown.deselectByIndex(4);
				
				//Get All Selected option and then retrieve option count
				int Dcount=StateDropdown.getAllSelectedOptions().size();
				
				//Decision statemenet to verify deselection
				if(Dcount==2)
				{
					System.out.println("Testpass:--> Deselected single option from multiple selection");
				}
				else
				{
					System.out.println("Testfail:--> Unable to deselection single option from multiple selection");
				}
			}
			else
			{
				System.out.println("failed to select multiple selection maximum as 3");
			}
			
			
		}
		else
		{
			System.out.println("Dropdown is single option type");
		}
				

	}

}
