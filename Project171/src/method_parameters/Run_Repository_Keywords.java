package method_parameters;

import org.openqa.selenium.By;

import pageobject.Variable.FB_locators;

public class Run_Repository_Keywords {

	public static void main(String[] args)
	{
		
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);

	     
		obj.Enter_text("//input[@name='firstname']", "Kiran");
		obj.Enter_text("//input[@name='lastname']", "Kumar");
		
		obj.Enter_text(By.cssSelector("#u_0_r"), "kirankumar@gmail.com");
		obj.Enter_text(By.id("u_0_u"), "kirankumar@gmail.com");
		
		//Enter login details
		obj.Enter_text(FB_locators.signin_email, "9030248855");
		
		
		//Create object inorder to use pagefactory methods
		
		
	}

}
