package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Any_Text_visible_At_Webpage {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  
		driver.get("http://gmail.com");  
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		//identify page
		WebElement page=driver.findElement(By.tagName("body"));
		//capture page visible text
		String Page_visible_text=page.getText();
		System.out.println(Page_visible_text);
		
		

	}

}
