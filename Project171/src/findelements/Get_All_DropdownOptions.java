package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_All_DropdownOptions {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Month_Dropdown=driver.findElement(By.id("month"));	
		List<WebElement> AllOptions=new Select(Month_Dropdown).getOptions();
		
		//Iterate for list of options
		for (int i = 0; i < AllOptions.size(); i++) 
		{
			WebElement Index_Option=AllOptions.get(i);
			Index_Option.click();
			Thread.sleep(1000);
		}
		
		
		/*
		 * GetOptions:-->
		 * 			GetOptions is a dropdown Selec class method, It
		 * 			Collect list of <Option> tag elements under <Select>
		 * 			tag and store all object into  List<WebElement> ... 
		 * 
		 * 		WebElement Dropdown_Element=driver.findElement(By.id("DropdownID"));
		 * 		List<WebElement> Dropdown_Options=new Select(Dropdown_Element).getOptions();
		 * 	
		 * 		//List Interface allows to access any single object from collection
		 * 		//using index number
		 * 
		 * 		Dropdown_Options.get(5).Click();
		 */
		
		/*
		 * getAllSelectedOptions:-->
		 * 		=> This method only works on multiple selection dropdown.
		 * 		=> Method capture only selected option under dropdown
		 * 			and store selected Dropdown options into list<WebEleemnt>
		 * 
		 * 
		 * 			WebElement Dropdown_Element=driver.findElement(By.id("DropdownID"));
		 * 			boolean flag=new Select(Dropdown_Element).ismultiple();
		 * 			if(flag==true)
		 * 			{
		 * 				Select Dropdown_Selector=new Select(Dropdown_Element);
		 * 				Dropdown_Selector.SelectByIndex(3);
		 * 				Dropdown_Selector.SelectByIndex(6);
		 * 
		 * 				//To Verify Dropdown accept more than one option
		 * 				List<WebElement> SOptions=Dropdown_Selector.getAllSelectedOptions();
		 * 				if(SOptions.Size() > 1)
		 * 				{
		 * 					System.out.println("More than one option completed")
		 * 				}
		 * 				else
		 * 				{
		 * 					System.out.println("Single Option Selected")
		 * 				}
		 * 			}
		 * 		
		 */
		

	}

}
