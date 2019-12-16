package testng_Framework.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InputData2
{
	
	@DataProvider
	public String[][] User_info()
	{
		
		String data[][]=
			{
					{"arun","9030","Test"},
					{"arun1","9040","Dev"},
					{"arun2","9050","Test"},
					{"arun3","9060","Dev"},
			};
		
		
		return data;
		
	}
	
	
	@Test(dataProvider="User_info")
	public void Test(String UID,String Mobile,String Role)
	{
		
	}
	
	

}
