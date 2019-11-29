package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_InsideCell_BasedOn_Referral_Row 
{

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//Click markets link to display today Gainers & Losers List
		driver.findElement(By.xpath("(//a[contains(.,'markets')])[1]")).click();
		
		//Identifying Table at Webpage
		WebElement Table=driver.findElement(By.cssSelector("#dvToplooser > table"));
		
		
		//Find list of rows undert webtable
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		//Get Object count at list
		int Row_Count=rows.size();
		
		//Applying for loop to iterate
		for (int i = 1; i < Row_Count; i++) 
		{
			//It targt every row in webtable by using for loop increment.
			WebElement DynamicRow=rows.get(i);
			
			//Capture Dynamic Row Text
			String Row_Text=DynamicRow.getText();
			
			if(Row_Text.contains("MAHMAH"))
			{
				//Get Collection of Cell count under each dynamic row.
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Identify News cell using static cell index number
				WebElement News_Cell=cells.get(7);
				
				News_Cell.findElement(By.tagName("a")).click();
				break; //break iteration after click link.
				
			}
			
			
			
			
		}

	}

}
