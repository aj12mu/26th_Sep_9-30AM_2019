package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_NumberOf_WindowsCount {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Perform action on external link [External link open in new window]
		driver.findElement(By.linkText("Instagram")).click();
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("timeout released expected windows are opened");
		
		

	}

}
