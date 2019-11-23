package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_Until_Title_Presented 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		System.out.println("broser maximized");
		
		//Statement to verify expected title 
		//presented at webpage along with explicit wait
		String Exp_title="SeleniumHQ Browser Automation";
		new WebDriverWait(driver, 10).until
					(ExpectedConditions.titleIs(Exp_title));
		
		System.out.println("selenium homepage title verified");
		
		//Click Downlaod link
		driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]")).click();
		
		
		new WebDriverWait(driver, 20).until
				(ExpectedConditions.titleContains("Download"));
		System.out.println("Downloads page title verified");
		
		

	}

}
