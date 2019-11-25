package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Runtime_Changes 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("http://facebook.com");       
		driver.manage().window().maximize();  
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Identif Webelement
		WebElement Email_editbox=driver.findElement(By.id("email"));
		
		
		//Disable Element
		js.executeScript("arguments[0].disabled=true;",Email_editbox);
		Thread.sleep(10000);
		
		//Enabled element
		js.executeScript("arguments[0].disabled=false;",Email_editbox);
		Thread.sleep(5000);
		
		
		//Hide element from webpage
		js.executeScript("arguments[0].style.visibility='hidden';",Email_editbox);
		Thread.sleep(5000);
		
		//Visibility of element
		js.executeScript("arguments[0].style.visibility='visible';",Email_editbox);
		Thread.sleep(5000);
		
		//Convert Single Selection dropdown to multiple selection dropdown
		js.executeScript("document.getElementById('month')"
				+ ".setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		//Remove multiple selection
		js.executeScript("document.getElementById('month')"
				+ ".removeAttribute('multiple')");
		
	}

}
