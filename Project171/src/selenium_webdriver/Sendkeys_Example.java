package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example 
{

	public static void main(String[] args)
	{
		//Set Runtime environment variable
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://facebook.com");       //Load page to browser
		driver.manage().window().maximize();  //Maximize browser w

		
		driver.findElement(By.name("firstname"))
		.sendKeys("Rahul"+Keys.TAB
				+"Krishna"+Keys.TAB
				+"rahulkrishna@gmail.com"+Keys.TAB
				+"rahulkrishna@gmail.com"+Keys.TAB
				+"Hello123456");
		
		//Selection of dropdown option using sendkeys.
		driver.findElement(By.id("day")).sendKeys("23");
		
		//Selection of dropdown option using keyboard shortcuts
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		System.out.println("Day dropdown selected");
		
		
		
	}

}
