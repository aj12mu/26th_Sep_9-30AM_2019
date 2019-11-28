package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links 
{

	public static void main(String[] args) throws Exception 
	{
	
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		
		WebElement Area_Footer;
		Area_Footer=driver.findElement(By.cssSelector(".inline.clearFix"));
		
		//Using Footer area identificaiton identify list of Link
		List<WebElement> Footer_links;
		Footer_links=Area_Footer.findElements(By.tagName("a"));
		System.out.println("Size of footer links is => "+Footer_links.size());
		
		//Apply for loop to iterate for number of links
		for (int i = 0; i < Footer_links.size(); i++) 
		{
				//Access Each link from Collection of objects
				WebElement Eachlink=Footer_links.get(i);
				
				//At runtime capture link name and href
				String linkname=Eachlink.getText();
				String linkhref=Eachlink.getAttribute("href");
				
				System.out.println(linkname+"   "+linkhref);
				
				//Click Each link
				Eachlink.click();
				Thread.sleep(2000);
				
				driver.navigate().back();
				Thread.sleep(2000);
				//Restore all Element references to avoid <<Staleelement-Reference_Exception>>
				Area_Footer=driver.findElement(By.cssSelector(".inline.clearFix"));
				Footer_links=Area_Footer.findElements(By.tagName("a"));
		}
		
		
		
		
	}

}
