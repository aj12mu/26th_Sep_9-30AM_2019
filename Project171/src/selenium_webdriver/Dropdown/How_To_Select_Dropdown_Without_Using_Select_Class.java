package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_To_Select_Dropdown_Without_Using_Select_Class {

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");     //Load webpage
		driver.manage().window().maximize();  //maximize browser window
			
		//By targeting location of <option> tag we can click without using a selector class
		driver.findElement(By.cssSelector("#customState > option:nth-child(4)")).click();
		System.out.println("Option Selected");

		
		
	}

}
