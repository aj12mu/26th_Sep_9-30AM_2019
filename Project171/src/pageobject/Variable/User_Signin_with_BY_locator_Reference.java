package pageobject.Variable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Signin_with_BY_locator_Reference {

	public static void main(String[] args) {
		

		//Set Runtime environment variable
		String path="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://facebook.com");       //Load page to browser
		driver.manage().window().maximize();  //Maximize browser w

		
		driver.findElement(FB_locators.signin_email).clear();
		driver.findElement(FB_locators.signin_email).sendKeys("Arun");
		
		driver.findElement(FB_locators.signin_password).clear();
		driver.findElement(FB_locators.signin_password).sendKeys("Hello");
		
		driver.findElement(FB_locators.signin_login_btn).click();
		

	}

}
