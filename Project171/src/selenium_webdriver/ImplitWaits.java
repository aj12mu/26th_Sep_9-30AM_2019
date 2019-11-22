package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplitWaits {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		
		driver.manage().timeouts()
		.implicitlyWait(100, TimeUnit.SECONDS)
		.pageLoadTimeout(100, TimeUnit.SECONDS)
		.setScriptTimeout(100, TimeUnit.SECONDS);
		
		

	}

}
