package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws Exception
	{
		
		//Set Runtime environment variable
		String path="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://gmail.com");       //Load page to browser
		driver.manage().window().maximize();  //Maximize browser window
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("hello12345"+Keys.ENTER);
		
		
	}

}
