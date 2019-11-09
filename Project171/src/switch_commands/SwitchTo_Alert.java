package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario;--> Verify job search functionality at first naukri
		 * 	
		 * 		Given url is https://www.firstnaukri.com/
		 * 		when user click on search button without enter details
		 * 		then system respond with appropriate error msg at alert window.
		 */
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.firstnaukri.com/");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
								
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_btn.click();
		
		//Switching to alert and stored alert referal
		Alert alert=driver.switchTo().alert();
		
		//capture alert text
		String Alert_msg=alert.getText();
		System.out.println(Alert_msg);

		//Close alert window
		alert.accept();
		
		
		
		
		
		
	}

}
