package testng_Framework;

import java.io.File;
import java.lang.reflect.Method;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_WebDriver_Testcase 
{
	 WebDriver driver;
	 String filepath="browser_drivers\\";
	
	@Test
	void Tc001_Verify_Signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		Reporter.log("Singup title verified ");
	}
	
	@Test
	void Tc002_Verify_Messenger_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		String Exp_title="Messenger";
		Assert.assertEquals(Exp_title, driver.getTitle());
		Reporter.log("Messenger title verified ");
	}
	
	@Test
	void Tc003_Verify_Games_link() 
	{
		driver.findElement(By.xpath("//a[@href='/games/']")).click();
		String Exp_title="Games";
		Assert.assertEquals(Exp_title, driver.getTitle());
		Reporter.log("Games title verified ");
	}
	
	
	
	
	@BeforeClass
	public void beforeclass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", filepath+"chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@AfterClass
	public  void AfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}
	
	@BeforeMethod
	void beforemethod() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@AfterMethod
	void tearDown(Method method) throws Exception 
	{
		//Get Aftemethod annotation constucted @Test methodname
		String methodName = method.getName();
		
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File("screens\\"+methodName+".png"));
		
	}


}
