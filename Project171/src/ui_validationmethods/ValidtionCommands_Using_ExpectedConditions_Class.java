package ui_validationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ValidtionCommands_Using_ExpectedConditions_Class {

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://facebook.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
						

		//Using ExpectedConditions Verify Title presented at webpage
		boolean flag=ExpectedConditions.titleContains("Facebook").apply(driver);
		System.out.println("Facebook Title Verification Status => "+flag);
		

		//Using ExpectedConditions verify url presented at webpage
		boolean flag1=ExpectedConditions.urlContains("https://facebook.com").apply(driver);
		System.out.println("Facebook url verification status is => "+flag1);
		
		
		WebElement Email=ExpectedConditions.visibilityOf
				(driver.findElement(By.id("email"))).apply(driver);
		Email.clear();
		Email.sendKeys("darshan@gmail.com");
		
		
		
	}

}
