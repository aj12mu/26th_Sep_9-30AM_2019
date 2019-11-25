package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Runtime_Browser_Validations {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("http://facebook.com");       
		driver.manage().window().maximize(); 
		
		
		//Enable javascript at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Get Runtime title using javascript.
		String page_title=js.executeScript("return document.title").toString();
		System.out.println("page title is => "+page_title);
		
		//return current window URL
		String Runtime_url=js.executeScript("return window.location.href").toString();
		System.out.println("Current window title is => "+Runtime_url);
				
		
		
		
	}

}
