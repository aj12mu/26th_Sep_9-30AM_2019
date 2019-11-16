package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick_On_Element {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		//Idenify location at webapge
		WebElement Element=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Enable mouse and keyboard interaction on automation browser
		new Actions(driver).contextClick(Element).pause(4000).perform();
		
		
		//Idetify Option at context menu
		WebElement Delete_btn=driver.findElement(By.xpath("//span[text()='Delete']"));
		Delete_btn.click();
		Thread.sleep(5000);  //timeout to watch alert..
		
		
		try {
		
			//Switch to alert and accept alert window
			driver.switchTo().alert().accept();
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		
	}

}
