package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_Element_Text 
{

	public static void main(String[] args) throws Exception
	{
		/*
		 * Scenario:--> Verify flight search without enter proper details.
		 * 
		 * 		Given url is  http://cleartrip.com
		 * 		when user click search flights button
		 * 		Then system response with appropriate error message.
		 */
		
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
					
		WebElement Search_Flights=driver.findElement(By.xpath("//input[@title='Search flights']"));
		Search_Flights.click();
		Thread.sleep(5000);//Static timeout to load error message
		
		//Identifying location of text
		WebElement Error_text_location=driver.findElement(By.id("homeErrorMessage"));
		//Capture text at location
		String Act_err=Error_text_location.getText();
		System.out.println(Act_err);
		
		
		String Exp_Err="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		//Verify expected and actual text
		if(Act_err.contains(Exp_Err))
			System.out.println("Expected error msg displayed on invalid search");
		else
			System.out.println("expected error msg not displayed on invalid search");
		
		
	}
}
