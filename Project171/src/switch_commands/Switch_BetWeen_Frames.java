package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_BetWeen_Frames {

	public static void main(String[] args) throws Exception {
	
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   		//Launch chrome browse
		driver.get("https://epass.apcfss.in/");     //load webpage to browser window
		driver.manage().window().maximize();	 	//maximize browser window

		
		
		//Switch to frame using FrameID
		driver.switchTo().frame("menuFrame");
		//Identify link under menuframe and perform click oaction
		driver.findElement(By.linkText("Fee Structure")).click();
		Thread.sleep(3000);
		
		//Get Controls back to mainpage from menuframe
		driver.switchTo().defaultContent();
		
		
		//Switch to Frame Using FrameIndex
		driver.switchTo().frame(5);
		//Identify Dropdown under frame
		WebElement University=driver.findElement(By.id("univ"));
		new Select(University).selectByIndex(4);
		
	}

}
