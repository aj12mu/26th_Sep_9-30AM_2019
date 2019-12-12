package modular_Framework;

public class Testcases extends Keywords
{
	
	 Hotel_Search HS;
	
	public  void Search_Hotel()
	{
		HS=new Hotel_Search(driver);
		click_element(HS.Hotels_page_link);
		Enter_Text(HS.Where_locality_EB, "HYD");
		click_element(HS.Locatity_City_Option);
		click_element(HS.CheckIn_Date_link);
		click_element(HS.CheckOut_Date_link);
		Select_Dropdown(HS.Travelers_Dropdown, "1 room, 2 adults");
		click_element(HS.Hotel_Search_button);
	}
	
	

}
