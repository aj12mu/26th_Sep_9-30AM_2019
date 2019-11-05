package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_behaviour_Using_Runtime_Attribute {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
									
		//Identify location
		WebElement Nifty_tab=driver.findElement(By.id("TradeRec"));
		
		//Get runtime attribute value using attribute name
		String Runtime_Class=Nifty_tab.getAttribute("class");
		
		if(Runtime_Class.contains("tab-active"))
			System.out.println("as expected nifty was selected");
		else
			System.out.println("Failed nifty tab was not selected");
		

	}

}
