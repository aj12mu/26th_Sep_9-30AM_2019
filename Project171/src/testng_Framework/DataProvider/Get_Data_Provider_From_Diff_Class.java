package testng_Framework.DataProvider;

import org.testng.annotations.Test;

public class Get_Data_Provider_From_Diff_Class 
{
	/*
	 * Note;--> Inorder to get dataprovider annotaion data from
	 * 			 diff class, We must define dataprovider class
	 * 			 and method name.
	 */
	@Test(dataProviderClass=InputData2.class,dataProvider="User_info")
	public void get_user_data(String UID,String Mobile,String Role)
	{
		
	}

}
