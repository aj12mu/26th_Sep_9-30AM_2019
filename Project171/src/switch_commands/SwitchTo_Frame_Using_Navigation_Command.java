package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Command {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch chrome browse
		driver.get("https://www.redbus.in/hotels/");     //load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window

		
		//Using javascript executor scroll page down
		((JavascriptExecutor)driver).executeScript("scroll(100,200)");
		Thread.sleep(3000);
		
	
		//Using Frame url navigate to Frame
		driver.navigate().to("https://www.redbus.in/account?pageName=Hotels");
		Thread.sleep(3000);
		
		WebElement Mobile_number=driver.findElement(By.xpath("//input[contains(@id,'mobileNoInp')]"));
		Mobile_number.clear();
		Mobile_number.sendKeys("9030248855");
		
		
		
		

	}

}
