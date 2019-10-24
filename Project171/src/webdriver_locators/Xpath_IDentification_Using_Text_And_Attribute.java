package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_IDentification_Using_Text_And_Attribute {

	public static void main(String[] args) throws InterruptedException {
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();  
		driver.get("http://naukri.com");      
		driver.manage().window().maximize();  
		
		
		/*
		 * identify Location using element text
		 * HtmlSource:-->
		 * 		<button id="cjaMain">Create a Job Alert</button>
		 * Syntax:--.
		 * 		//tagname[text()='ElementText']
		 * 
		 * Note:-->
		 * 		text()  or .[dot] keywords target Element Text area at hmtl-node
		 */
		
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		
		/*
		 * Identify location using Element Attributes
		 * HtmlSource:-->
		 * 			<input class="sugInp" name="keyskills" type="text">
		 * Syntax:-->
		 * 			//tagname[@Propertyname='PropertyValue']
		 * 
		 *  Note:-->
		 *  		@ symbol identify only attributes at html-node
		 */
		driver.findElement(By.xpath("//input[@name='keyskills']")).clear();
		driver.findElement(By.xpath("//input[@name='keyskills']")).sendKeys("software testing");
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[.='Automation Testing']")).click();
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[text()='Selenium']")).click();
		Thread.sleep(2000);
		
		//Select Element with text identification
		driver.findElement(By.xpath("//div[.='Cucumber']")).click();
		
		

	}

}
