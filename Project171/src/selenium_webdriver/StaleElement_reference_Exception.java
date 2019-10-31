package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_reference_Exception {

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable
		String path="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://facebook.com");       //Load page to browser
		driver.manage().window().maximize();  //Maximize browser w

		
		By password_locator=By.id("pass");
		
		driver.navigate().refresh();
		
		
		WebElement Password_EB=driver.findElement(password_locator);
		Password_EB.clear();
		Password_EB.sendKeys("Hello12345");
		

	}

}
