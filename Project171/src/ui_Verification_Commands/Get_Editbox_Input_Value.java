package ui_Verification_Commands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Editbox_Input_Value {

	public static void main(String[] args)
	{
		/*
		 * Scenario:-->
		 * 			Verify departure date at flight booking scenario,
		 * 			Always display date as current system date.
		 */
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	 //Launch browser
		driver.get("https://www.spicejet.com");  //Load webpage
		driver.manage().window().maximize();     //maximize browser window
						
		
		//Identify Deapature date editbox
		WebElement Departure_Date_EB=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		//Capture input text available from editbox
		String Ddate=Departure_Date_EB.getAttribute("value");
		System.out.println(Ddate);
		
		//Capture current system date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat df=new SimpleDateFormat("dd/MM");
		//Using date formatter convert current system date
		String Sdate=df.format(d);
		
		//Verify system date matching with departure date
		if(Ddate.equals(Sdate))
			System.out.println("Data match found");
		else
			System.out.println("Date mismatch");
	}

}
