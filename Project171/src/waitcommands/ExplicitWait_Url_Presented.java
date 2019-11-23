package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Url_Presented 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		System.out.println("Browser window maxmized");
		
		
		//Apply explicit wait to verify url presented at webpage
		new WebDriverWait(driver, 10).until
				(ExpectedConditions.urlToBe("https://selenium.dev/"));
		System.out.println("Selenium Homepage url verified");
		
		
		//Click Downlaod link
		driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]")).click();
				
		
		//Apply rcplicit wait to verify partial url presented 
		new WebDriverWait(driver, 10).until
					(ExpectedConditions.urlContains("downloads"));
		System.out.println("Downloads page url verified");
		
		
		
		
		
	}

}
