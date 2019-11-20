package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_On_Page 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Sendkeys on Location
		WebElement Firstname=driver.findElement(By.xpath("//input[@aria-label='First name']"));
		Firstname.clear();
		Firstname.sendKeys("Charan",Keys.TAB,"Reddy");
		
		//Sendkeys on page [Set of keyboard actions along with time gap]
		new Actions(driver).sendKeys(Firstname, "Charan")
		.pause(5000).sendKeys(Keys.TAB).pause(3000)
		.sendKeys("Reddy").build().perform();
		

		/*
		 * Example:--> For sendkeys action.
		 * 
		 * https://www.firstnaukri.com/jobs-internship
		 */
		
	}

}
