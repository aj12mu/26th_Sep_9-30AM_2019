package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Actions_Using_Javascript {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("http://facebook.com");       
		driver.manage().window().maximize();  
		
		
		//Enable Javascript executor at automation browser.
		JavascriptExecutor js=((JavascriptExecutor)driver);
	
		
		//Type Text into editbox using javascript
		js.executeScript("document.getElementById('u_0_m').value='Newuser'");
		js.executeScript("document.getElementById('u_0_o').value='Newuser'");
		
		//Type text into editbox when Element not havid id property.
		WebElement Mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		js.executeScript("arguments[0].value='9030248855'", Mobile);
		
		//type text into password editbox
		WebElement Password=driver.findElement(By.xpath("//input[@data-type='password']"));
		js.executeScript("arguments[0].value='Hello12345'", Password);
		
		
		//===> Select dropdown using javascript
		
		
		js.executeScript("document.getElementById('day').value='9'");
		//Inorder to select dropdown option using javascript, follow Dropdow option
		//value property
		
		//Select month dropdown using javascript
		js.executeScript("document.getElementById('month').value='5'");
		
		//Select dropdown using javascript when element not havind ID property
		WebElement Year_Dropdown=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		js.executeScript("arguments[0].selectedIndex='12'", Year_Dropdown);
		
		
		//Select Radio button using javascript
		WebElement Female_Radio_btn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].click()", Female_Radio_btn);
		
		
		Thread.sleep(5000);
		//Select Radio button using javascript
		WebElement Male_Radio_btn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].checked='true'", Male_Radio_btn);
				
		
		//Identify button
		WebElement Submit_btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		js.executeScript("arguments[0].click()", Submit_btn);
		
	}

}
