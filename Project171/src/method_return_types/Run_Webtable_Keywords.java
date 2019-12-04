package method_return_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Run_Webtable_Keywords {

	public static void main(String[] args)
	{
		
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		obj.set_timeout(30);
		

		obj.click_element("(//a[contains(.,'markets')])[1]");
		
		//Get data from static table
		WebElement CompanyCell=obj.Get_Static_Webtable_Cell("//div[@id='pnl_Bse']/table", 8, 0);
		String Company_name=CompanyCell.getText();
		System.out.println(Company_name);
		
	
		//get data from dynamic table
		WebElement NewsCell=obj.Get_Dynaic_Webtable_Cell("//div[@id='pnl_Bse']/table", "TCS", 7);
		NewsCell.findElement(By.tagName("a")).click();
		
		
		
		

	}

}
