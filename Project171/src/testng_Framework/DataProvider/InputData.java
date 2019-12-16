package testng_Framework.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "dp",enabled=false)
  public void test(Integer n, String s) 
  {
	 System.out.println(n+"   "+s); 
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  //================================================
  
  
  @DataProvider
  public Object[][] login_data() 
  {
    return new Object[][] 
    {
      new Object[] {"user1","pwd1" },
      new Object[] {"user2","pwd2" },
      new Object[] {"user3","pwd3" },
      new Object[] {"user4","pwd4" },
    };
  }
  
  
  @Test(dataProvider="login_data")
  public void Verify_login(String UID,String PWD)
  {
	  System.out.println(UID+"    "+PWD);
  }
  
  
}
