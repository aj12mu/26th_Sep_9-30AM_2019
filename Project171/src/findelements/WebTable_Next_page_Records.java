package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Next_page_Records {

	public static void main(String[] args)
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		//Identify Market link
		WebElement market_links=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		market_links.click();
		
		//Target NIfty link
		WebElement Nify_weightage_link=driver.findElement(By.xpath("//a[@title='Nifty Weightage']"));
		Nify_weightage_link.click();
		
		
		//identify Webtable
		WebElement table=driver.findElement(By.id("gridSource"));
		
		//Find list of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("list of rows available under table is => "+rows.size());
		
		int count=1;
		//Iterate for number of rows data
		for (int i = 1; i < rows.size(); i++) 
		{
			//Get each row using dynamic iterations
			WebElement DynamicRow=rows.get(i);
			System.out.println(DynamicRow.getText());
			
			if(count==20)
			{
				WebElement Next_btn=driver.findElement(By.xpath("//th[@class='table-page:next']"));
				Next_btn.click();
				count=0;
			}
			count=count+1;
		}


	}

}
