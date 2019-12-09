package junit_Framework;

import java.io.File;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junit_WebDriver_Testcase 
{
	static WebDriver driver;
	static String filepath="browser_drivers\\";
	
	@Test
	void Tc001_Verify_Signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
	}
	
	@Test
	void Tc002_Verify_Messenger_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		String Exp_title="Messenger";
		Assert.assertEquals(Exp_title, driver.getTitle());
	}
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", filepath+"chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}
	
	@BeforeEach
	void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File("screens\\img.png"));
		
	}


}
