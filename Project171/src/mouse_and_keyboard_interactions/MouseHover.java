package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		/*
		 * Enable Mouse and keybaord interaction at
		 * automation browser.
		 */
		
		WebElement Jobs_Menu=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		//Perform hover action on location
		new Actions(driver).moveToElement(Jobs_Menu).perform();
		
		WebElement Register_now_JobsMenu=driver.findElement(By.xpath("(//a[@target='_blank'][contains(.,'Register Now')])[1]"));
		//Perform click on element using actions class
		new Actions(driver).click(Register_now_JobsMenu).perform();
		
		
		
		
		
		
		
				

	}

}
