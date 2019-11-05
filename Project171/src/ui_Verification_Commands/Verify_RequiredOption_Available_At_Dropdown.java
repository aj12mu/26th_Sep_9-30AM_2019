package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_RequiredOption_Available_At_Dropdown {

	public static void main(String[] args) throws Exception
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");  
		driver.manage().window().maximize(); 
		
		
		
		//Target location of Dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		//using Location select dropdown option
		new Select(State_Dropdown).selectByVisibleText("Telangana");
		Thread.sleep(8000); //Static timeout to load cities
		
		//Target City dropdown  location
		WebElement City_dropdown=driver.findElement(By.id("customCity"));
		//Capture all Cities displayed w.r.t state.
		String Cities=City_dropdown.getText();
		System.out.println(Cities);
		
		//Verify expected city option available at under state.
		if(Cities.contains("Hyderabad"))
			System.out.println("Expected city displayed");
		else
			System.out.println("Expected city not displayed");
	}

}
