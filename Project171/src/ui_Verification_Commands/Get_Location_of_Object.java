package ui_Verification_Commands;

import java.util.function.ObjLongConsumer;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location_of_Object {

	public static void main(String[] args)
	{
		
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();   
				
		
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
	
		
		//Get Location X and Y coordinates
		Point Obj_Loc=Sensex_tab.getLocation();
		int obj_x=Obj_Loc.getX();
		int obj_y=Obj_Loc.getY();
		System.out.println("Object x coordinates are => "+obj_x);
		System.out.println("Object y coordinates are => "+obj_y);
				
		
		
		//Verify Element visible at webpage
		if(obj_x > 0)
			System.out.println("element visible at webpage");
		else
			System.out.println("element not visible at webpage");
		
		

	}

}
