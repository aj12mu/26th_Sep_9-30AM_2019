package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Read_Data_From_Specific_Row_And_Cell {

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
		WebElement Table=driver.findElement(By.cssSelector("#pnl_Bse > table"));
		
		//Gathering all list of rows available under table.
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		//Identifying 6th row at webtable
		WebElement SelectedRow=rows.get(5);
		
		//Finding list of cells under Selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//target any Selected cells using index number
		String Company_Name=cells.get(0).getText();
		String High_Price=cells.get(3).getText();
		String Low_Price=cells.get(4).getText();
		
		System.out.println(Company_Name+"   "+High_Price+"   "+Low_Price);
		
		
		//get 5th row and first cell record
		String New=Table.findElements(By.tagName("tr")).get(5)
				.findElements(By.tagName("td")).get(0).getText();
		System.out.println(New);
	}

}
