package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		//select dropdown using visible text
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("23");
		
		//select dropdown using option tag value attribute
		new Select(driver.findElement(By.id("month")))
		.selectByValue("9");
		
		//Select dropdown using index number.
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(21);

	}

}
