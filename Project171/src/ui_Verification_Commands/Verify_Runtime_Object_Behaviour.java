package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_Object_Behaviour {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify roundtrip is selected when user tap
		 * 				on return date object.
		 */
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/");  
		driver.manage().window().maximize(); 
		

		//tap on return date
		driver.findElement(By.cssSelector("div:nth-child(1) > label > .appendBottom10")).click();
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		//Get Runtime class property of attribute
		String Runtime_Class=Roundtrip.getAttribute("class");
		
		//Verify Roundtrip is selected
		if(Runtime_Class.contains("selected"))
			System.out.println("As expected roundtrip is selected");
		else
			System.out.println("Testfail, roundtrip is not selected");

	}

}
