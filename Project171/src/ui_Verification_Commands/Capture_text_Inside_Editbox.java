package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_text_Inside_Editbox 
{

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.gmail.com/");  
		driver.manage().window().maximize();
		
		
		WebElement Email_EB=driver.findElement(By.id("identifierId"));
		//Type text into email editbox
		Email_EB.clear();
		Email_EB.sendKeys("darshan");
		
		//Get Typed characters from editbox
		String Runtime_input=Email_EB.getAttribute("value");
		System.out.println(Runtime_input);
		

	}

}
