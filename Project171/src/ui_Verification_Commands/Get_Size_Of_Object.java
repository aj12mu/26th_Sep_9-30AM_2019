package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size_Of_Object {

	public static void main(String[] args) 
	{
		
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();   
				
		
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
	
		
		//Get object height and width
		Dimension obj_dim=Sensex_tab.getSize();
		int Obj_height=obj_dim.getHeight();
		int Obj_width=obj_dim.getWidth();
		System.out.println("object height available => "+Obj_height);
		System.out.println("object width available => "+Obj_width);
		
		//Verify Element visible at webpage
		if(Obj_height > 0)
			System.out.println("element visible at webpage");
		else
			System.out.println("element not visible at webpage");
		

	}

}
