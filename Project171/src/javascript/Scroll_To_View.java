package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_To_View {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("http://facebook.com");       
		driver.manage().window().maximize();  
		
		
		//Move to Element using mouse action.
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].scrollIntoView()",Instagram_link);

	}

}
