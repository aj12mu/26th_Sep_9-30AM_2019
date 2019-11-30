package pageobjects.WithConstructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Flight_Search 
{
	
	public Flight_Search(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//h1[contains(.,'Search flights')]")
	private WebElement Page_header;
	
	@FindBy(how=How.ID,using="OneWay") 
	private WebElement Oneway_Rbtn; 
	
	@FindBy(how=How.XPATH,using="//strong[contains(.,'One way')]")
	private WebElement Oneway_Rbtn_label;
	
	@FindBy(xpath = "//input[@id='RoundTrip']")
	private WebElement Roundtrip_Rbtn;
	
	@FindBy(xpath = "(//strong[contains(.,'Round trip')])[1]")
	private WebElement Roundtrip_Rbtn_Label;
	
	@FindBy(xpath = "//input[@id='MultiCity']")
	private WebElement Multicity_Rbtn;
	
	@FindBy(xpath = "//strong[contains(.,'Multi-city')]")
	private WebElement Multicity_Rbtn_Label;
	
	@FindBy(xpath = "//input[@id='FromTag']")
	private WebElement From_Auto_EB;
	
	@FindBy(xpath = "//input[@id='ToTag']")
	private WebElement To_Auto_EB;
	
	@FindBy(xpath = "//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")
	private WebElement From_City_Option;
	
	@FindBy(xpath = "//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")
	private WebElement To_City_Option;
	
	
	
	//InputData
	public String Input_From_City="HYD";
	public String Input_To_City="DEL";
	public String Exp_Page_title="#1 Site for Booking Flights, Hotels, Packages, Trains";
	public String Exp_page_header="Search flights";
	
	
	/*
	 * MethodName:--> Flight Search
	 */
	public void Verify_Flights_Search_Page_Header()
	{
		String Runtime_header_Text=Page_header.getText();
		
		if(Runtime_header_Text.equalsIgnoreCase(Exp_page_header))
			System.out.println("expected header text visible");
		else
			System.out.println("expected header text not visible");
		
	}
	
	
	
	
	
	/*
	 * MethodName;--> Oneway_Search
	 */
	public void Flight_Oneway_Search()
	{
		
		Oneway_Rbtn.click();
		
		From_Auto_EB.clear();
		From_Auto_EB.sendKeys(Input_From_City);
		From_City_Option.click();
		
		To_Auto_EB.clear();
		To_Auto_EB.sendKeys(Input_To_City);
		To_City_Option.click();
		
	}
	
	
	
}
