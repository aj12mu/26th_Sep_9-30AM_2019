package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_Element_Visibility {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		System.out.println("Browser window maxmized");
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		
		new WebDriverWait(driver, 50).until
			(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		System.out.println("password element visible at webpage ...");
		
		//Type text into password editbox
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("hello12345"+Keys.ENTER);
		
		
		
		

	}

}
