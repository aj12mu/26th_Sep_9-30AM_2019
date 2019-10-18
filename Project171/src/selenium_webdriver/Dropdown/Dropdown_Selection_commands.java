package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_commands {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");     //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Select dropdown using visible text
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Delhi");
		
		
		//Static timegap to load cities w.r.t state selection
		Thread.sleep(5000);
		
		
		//select dropdown using option value attribute
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("new-delhi");
		
		//Type text into locality editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		
		//Select dropdow using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		//Seleting checkbox
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		
		//click on Search button
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/form[2]/ul/li[7]/input")).click();
	}

}
