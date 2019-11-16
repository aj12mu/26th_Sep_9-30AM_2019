package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws Exception 
	{
	
		//browser initiation command
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		/*
		 * Note:-->
		 * 		Enable mouse and keybord interaction on automation
		 * 		browser.
		 */
		Actions action=new Actions(driver);
		
		
		//Identify Elements
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=driver.findElement(By.xpath("//div[@id='droptarget']"));
		
	
		//Perfrom drag and drop acton
		action.dragAndDrop(src, dst).build().perform();
		
		/*
		 * Drag and Drop with mouse actions
		 * 
		 * action.clickAndHold(src).moveToElement(dst)
		 * 			.release(src).build().perform();
		 * 
		 */
		
		/*
		 * Example:--> Try Drag and drop feature.
		 * 
		 * 		https://jqueryui.com/droppable/
		 */
		

	}

}
