package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_And_KeyUp_Action {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();

		
		//Identify Frame 
		WebElement ModalFrame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(ModalFrame);
		
		
		//Usng Keyboard actions HoldDown control key
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		//Click list of items in random order
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		
		//After complete selection perform keyup action
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		
		

		
		
	}

}
