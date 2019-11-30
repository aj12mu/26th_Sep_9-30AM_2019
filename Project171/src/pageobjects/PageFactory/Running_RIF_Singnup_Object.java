package pageobjects.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Running_RIF_Singnup_Object {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		
		/*
		 * => Inorder to use @Findby variables we should
		 * 	  access using "pagefactory" class
		 */
		RIF_Signup Signup=PageFactory.initElements(driver, RIF_Signup.class);
		Signup.Link_Create_new_Account.click();
		
		Signup.Fullname_EB.clear();
		Signup.Fullname_EB.sendKeys("Prain");
		
		Signup.Email_ID_EB.clear();
		Signup.Email_ID_EB.sendKeys("pepo1234");
		
		Signup.Email_Check_Availability_Btn.click();
		
		Signup.Password_EB.clear();
		Signup.Password_EB.sendKeys("hello12345");
		
		//Select Dropdown
		new Select(Signup.DOB_list.get(1)).selectByIndex(3);
		

	}

}
