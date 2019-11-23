package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_Text_visible_At_Location {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		System.out.println("Browser window maxmized");
		
		
		//Type email and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		
		//Enable Explicit wait at automation browser
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElementLocated
				(By.xpath("//span[contains(.,'Welcome')]"), "Welcome"));
		
		System.out.println("Timeout released expected text visible at location");
		
				

	}

}
