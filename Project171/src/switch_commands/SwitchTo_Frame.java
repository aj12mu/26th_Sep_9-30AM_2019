package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchTo_Frame 
{

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			 
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");     
		driver.manage().window().maximize();             
		
		//Switch controls from page to frame.
		driver.switchTo().frame("modal_window");
		
		//Under frame element
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys("darshan@gmail.com");
		
		//Under Frame Element
		WebElement Trip_ID=driver.findElement(By.id("tripidSecond"));
		Trip_ID.clear();
		Trip_ID.sendKeys("12121121");
		
		
		//Get Controls back to mainpage
		driver.switchTo().defaultContent();
		
		//PageElement
		driver.findElement(By.linkText("Flights")).click();
		
		
	}

}
