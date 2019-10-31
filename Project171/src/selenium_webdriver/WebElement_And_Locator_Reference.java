package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_And_Locator_Reference {

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable
		String path="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://facebook.com");       //Load page to browser
		driver.manage().window().maximize();  //Maximize browser w

		
		//Scripting wihtout using any references
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");

		
		WebElement Password_EB=driver.findElement(By.id("pass"));
		Password_EB.clear();
		Password_EB.sendKeys("Hello12345");
		
		By Login_btn_locator=By.xpath("//input[@value='Log In']");
		WebElement Login_btn=driver.findElement(Login_btn_locator);
		Login_btn.click();
	}

}
