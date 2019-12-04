package pageobjects.With_Resuable_Keywords;

import method_return_types.Repository;

public class Run_using_Keywords 
{


	public static void main(String[] args)
	{
		
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
	
		FB_Registration reg=new FB_Registration(obj.driver);
		
		obj.Enter_Text(reg.Firstname, "Akash");
		obj.Enter_Text(reg.Surname, "Chandra");
		obj.Enter_Text(reg.Email_or_Mobile, "akshanchandra@gmail.com");
		obj.Enter_Text(reg.Retype_mobile, "akshanchandra@gmail.com");
		obj.Enter_Text(reg.Password, "12312312");
		
		obj.Select_Dropdown(reg.DOB_Day, "12");
		obj.Select_Dropdown(reg.DOB_Month, "Jan");
		obj.Select_Dropdown(reg.DOB_year, "1990");
		
		
		
		
		
	}

}
