package keyword_driven_Framework;

import org.openqa.selenium.By;

public class Driver 
{
	
	public static void main(String args[]) throws Exception
	{
		
		ExcelKeywords.filepath="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\src\\keyword_driven_Framework\\";
		ExcelKeywords.getExcel_connection("KWD.xlsx", "Sheet1");
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(20);
		
		//Get Row count
		int Rcount=ExcelKeywords.sht.getLastRowNum();
		
		//Iterate for number of rows
		for (int i = 1; i <= Rcount; i++) 
		{
				String Testname=ExcelKeywords.GetCellData(i, 0);
				String Locator_Name=ExcelKeywords.GetCellData(i, 1);
				String Locator_Value=ExcelKeywords.GetCellData(i, 2);
				String Keyword=ExcelKeywords.GetCellData(i, 3);
				String InputData=ExcelKeywords.GetCellData(i, 4);
				
				
				//Convert Locator from string to By reference class
				By Default_Locator=Locator.convert_locator(Locator_Name, Locator_Value);
			
				
				switch (Keyword) 
				{
				case "enter_text":
					obj.Enter_Text(Default_Locator, InputData);
					break;
					
					
				case "select_dropdown":
					obj.Select_Dropdown(Default_Locator, InputData);
					break;
					
				case "click_element":
					obj.click_element(Default_Locator);
					break;
		
				case "switchto_window":
					obj.switchto_window(InputData);
					break;
		
				case "switchto-alert":
					obj.is_alert_text_presented(InputData);
					break;
		
				case "switchto_frame":
					
					break;
		
				case "mouse_hover":
					obj.mousehover(Default_Locator);
					break;
		
	

				default:
					break;
				}
			
		}
	}
 
 }


