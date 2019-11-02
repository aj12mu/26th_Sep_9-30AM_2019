package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_PageSource {

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://google.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
				
		
		String Expected_Element_At_Source="popupCloseButton";
		
		//Capture runtime pagesoure
		
		String Runtime_pagesource=driver.getPageSource();
		boolean flag=Runtime_pagesource.contains(Expected_Element_At_Source);
		//Decision statement to accept when expected dynamic element source presented at pagesource.
		if(flag==true)
		{
			WebElement Advertise_window=driver.findElement(By.className("popupCloseButton"));
			Advertise_window.click();
			System.out.println("Advertise window get closed");
		}
		
		//handling dynamic Source element at webpage
		try {
			
			WebElement Advertise_window=driver.findElement(By.className("popupCloseButton"));
			Advertise_window.click();
			System.out.println("Advertise window get closed");
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Run Continued");
		
	}

}
