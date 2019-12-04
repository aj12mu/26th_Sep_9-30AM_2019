package method_return_types;

import org.openqa.selenium.By;

public class Run_Repository {

	public static void main(String[] args) 
	{
		
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		//Verifying title presented at webpage
		if(obj.is_titlePresented("Facebook"))
			System.out.println("title presented");
		else
			System.out.println("title not presented");

		//Verifying url presented at webpage
		String url="https://www.facebook.com/";
		if(obj.is_Url_presented(url))
			System.out.println("url presented");
		else
			System.out.println("url not presented");
		
		//Verifying element presented at webpage
		String Email_id="u_0_m";
		if(obj.is_Element_presented(Email_id))
			obj.Enter_Text(By.id("u_0_m"), "Element Presented");
		else
			System.out.println("Element not presented");
		
		//verifying expected text available at location
		By Reg_header=By.xpath("//span[contains(.,'Create an account')]");
		if(obj.is_text_presented_At_Element(Reg_header, "Create an account"))
			System.out.println("text presented at location");
		else
			System.out.println("text not presented at elemnet");
		
		//Verifying Expected text visble at webpage
		String Exp_text="It's quick and easy.";
		if(obj.istext_visible_at_webpage(Exp_text))
			System.out.println("Text presented at webpage");
		else
			System.out.println("text not presented at webpage");
		
		//verifying expected input available at Editbox
		String Exp_input="Element Presented";
		By Firstname_loc=By.xpath("//input[@id='u_0_m']");
		if(obj.isInput_presented_At_Editbox(Firstname_loc, Exp_input))
			System.out.println("Input presented at editbox");
		else
			System.out.println("input not presented at editbox");
		
		
		//Verifying alert presented at webpage
		if(obj.isAlert_Presented())
			System.out.println("alert presented at webpage");
		else
			System.out.println("alert not presented at webpage");
	}

}
