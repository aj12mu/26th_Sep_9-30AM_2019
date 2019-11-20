package touch_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class SingleTap_Action {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		/*
		 * Enable touch actions on automation browser, Touch actions
		 * also contains mouse and keyboard actions.
		 */
		WebElement Element=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		//Singletap action analogs to click.
		new TouchActions(driver).singleTap(Element).perform();
		
		
		
		

	}

}
