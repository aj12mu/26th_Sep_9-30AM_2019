package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Styles {

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");  //Load webpage
		driver.manage().window().maximize();   
				
		
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
		Sensex_tab.click();
		
		
		//Sesex tab selected or not-selected verify using background color
		String BG_color=Sensex_tab.getCssValue("background-color");
		System.out.println(BG_color);
		
		
		if(BG_color.equals("rgba(231, 120, 23, 1)"))
			System.out.println("Sensex tab selected");
		else
			System.out.println("sensex tab not selected");
		
		
		//capture font-size available at location
		String font_size=Sensex_tab.getCssValue("font-size");
		System.out.println("font-size available on element=> "+font_size);
		
		//capture font available at location
		String font=Sensex_tab.getCssValue("font");
		System.out.println("font-size available on element=> "+font);
		
		//capture font available at location
		String alignment=Sensex_tab.getCssValue("alignment");
		System.out.println("alignment available at => "+alignment);
		
		/*
		 * Getcssvalue return color and background color in RGBA format
		 * 				R-RED, G-green, B-blue, A-alpha
		 */
	}

}
