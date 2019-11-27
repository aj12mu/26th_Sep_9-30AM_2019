package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Do_While 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Example:--> Print number 1 to 10
		int i=0;
		do {
			i=i+1;
			System.out.println(i);
		} while (i<10);
		
		
		//Example:--> When Given conditon return false
		int j=100;
		do {
			System.out.println("First job finished => "+j);
			j=j+1;
		} while (i<10);
		
		
		
		//Example:--> Wait Until Expected page load at webpage.

		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
			
		boolean flag;
		int k=0;
		do {
			driver.get("http://facebook.com");
			Thread.sleep(5000);
			
			try {
				driver.findElement(By.id("email"));
				flag=true;
				System.out.println("Element found at webpage");
			} catch (NoSuchElementException e) {
				flag=false;
			}	

			k=k+1;
			if(k==30)
			{
				throw new Exception("pageload fail after waiting "+k+"  Seconds");
			}
			
		} while (!flag);  //It eject loop when element found
	
				
		
		System.out.println("page found");
		
		
		

	}

}
