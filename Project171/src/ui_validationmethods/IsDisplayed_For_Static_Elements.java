package ui_validationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.gmail.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
								
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		
		//Writing decision statement to accept on element visible & Enabled
		if(Email_eb.isDisplayed())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		}
		else
			System.err.println("Email Element not visible at webpage");
		
	
		Thread.sleep(5000); //Static timeout to load password element
		
		
		//Identifying password element
		WebElement Password_EB=driver.findElement(By.name("password"));
		if(Password_EB.isDisplayed() && Password_EB.isEnabled())
		{
			Password_EB.clear();
			Password_EB.sendKeys("hello12345"+Keys.ENTER);
		}
		else
			System.out.println("password element not visible/enabled");
		
		Thread.sleep(3000); //Static timeout to load error message
		
		//identify error message at webpage
		WebElement Error_loc=driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div.Xk3mYe.VxoKGd.Jj6Lae > div.xgOPLd > div:nth-child(2) > span"));
		if(Error_loc.isDisplayed())
		{
			String Exp_errmsg=Error_loc.getText();
			String Act_errmsg="Wrong password. Try again or click Forgot password to reset it.";
			if(Exp_errmsg.equals(Act_errmsg))
				System.out.println("Testpass: Error msg matching with actual value");
			else
				System.out.println("Testfail:--> Error not matching with actual value");
		}

		/*
		 * ElementNotvisibleException   
		 * 			==> When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
