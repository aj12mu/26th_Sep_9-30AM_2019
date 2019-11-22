package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ElementVisibility 
{

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.gmail.com/");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		//Assigning explicit timeout to automation browser
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfElementLocated
				(By.id("identifierId"))).sendKeys("qadarshan");
		
		System.out.println("Email Element visible at webpage");
	

	}

}
