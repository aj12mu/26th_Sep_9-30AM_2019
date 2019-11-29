package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_Selecting_All_Active_Links {

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
		
		
		//outter loop to click Next button
		for (int i = 0; i < 5; i++) 
		{
			
			//IDentify Current Active month
			WebElement Active_month;
			Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Get All Active links under Current Month
			List<WebElement> Active_Dates;
			Active_Dates=Active_month.findElements(By.tagName("a"));
			
			//Iterate for active dates
			for (int j = 0; j < Active_Dates.size(); j++) 
			{
				//target each active link
				WebElement Each_Date=Active_Dates.get(j);
				Each_Date.click();
				//Thread.sleep(1000);
				
				//Open calendar
				Departure_Date_cal.click();
				
				//Restore all identifications of calendar to valid StaleElementReference Exception.
				Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_Dates=Active_month.findElements(By.tagName("a"));
				
				
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
