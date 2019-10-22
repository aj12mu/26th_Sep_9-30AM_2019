package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://cleartrip.com");     //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);
		
		//Selecting roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Thread.sleep(5000); //to load dynamic suggesstions 
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000); //to load sugesstions 
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		Thread.sleep(2000); //static timeout to watch
		driver.findElement(By.linkText("29")).click();
		
		Thread.sleep(2000); //static timeout to watch
		//Type date into arrival date editbox [Only when datepicker editbox is in writable mode]
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Thu, 19 Mar, 2020");
		
		//Seleting dropdown option using visible option name.
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("4");
		
		//Click moreoptions link
		driver.findElement(By.partialLinkText("More options:")).click();
		
		//click search button
		driver.findElement(By.id("SearchBtn")).click();
		
	}

}
