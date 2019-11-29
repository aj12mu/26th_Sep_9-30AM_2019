package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Required_Date_From_calendar 
{

	public static void main(String[] args) throws Exception
	{
		

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		WebElement Departure_Date_cal=driver.findElement(By.id("dpt_date"));
		//Click to open calendar
		Departure_Date_cal.click();
		
		
		String Exp_month="March 2020";
		String Exp_date="1";
		
		
		
		//outter loop to click Next button
		for (int i = 0; i < 5; i++) 
		{
			
			//IDentify Current Active month
			WebElement Active_month;
			Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Capture avtive month header.
			WebElement Month_Header_location=driver.findElement(By.xpath("(//th[@class='month'])[1]"));
			String Act_Month=Month_Header_location.getText();
			
			
		
			if(Act_Month.equals(Exp_month))
			{
				driver.findElement(By.linkText(Exp_date)).click();
				break; //Stop Loop iteration
			}
				
			
			
			if(i<4)
			{
				WebElement Next_month_btn=driver.findElement(By.xpath("//a[contains(@id,'showNextMonth')]"));
				Next_month_btn.click();
				Thread.sleep(3000);
			}
			
		}
		
		
		

	}

}
