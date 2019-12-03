package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository_Methods {

	public static void main(String[] args) throws Exception 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		//Enter text using xpath..
		obj.Enter_Text("//input[@name='email']", "User1");
		obj.Enter_Text("//input[@name='pass']", "78dfldjf8");
		
		//Enter text using other locators
		obj.Enter_Text(By.cssSelector("#u_0_m"), "Krishan");
		obj.Enter_Text(By.name("lastname"), "Vardhan");
		
		//Using Pageobjects
		FB_Signup Signup=new FB_Signup(obj.driver);
		obj.Enter_Text(Signup.Mobile_OR_Email_EB, "info.dsnr@gmail.com");
		obj.Enter_Text(Signup.ReEnter_Mobile_OR_Email_EB, "info.dsnr@gmail.com");
		
		//Select Dropdown using xpath
		obj.Select_Dropdown("//select[@id='day']", "15");
		//Select dropdown using By locator reference
		obj.Select_Dropdown(By.id("month"), "Feb");
		//Select Dropdown using pageobject.
		obj.Select_Dropdown(Signup.Year_DD, "1990");
		
		
		//Select Checkbox
		obj.click_element("//input[@value='1']");
		Thread.sleep(3000);
		
		//Select radio button with POM
		obj.click_element(Signup.Male_Rbtn);
		
		
		
		
		
		
	}

}
