package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Popup_Window {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("http://facebook.com");       
		driver.manage().window().maximize(); 
		

		//Enable javascript at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("return alert('tc001 Displayed')");
		Thread.sleep(5000);
		
		//closing alert with webdriver syntax
		driver.switchTo().alert().accept();
		System.out.println("Alert closed");

	}

}
