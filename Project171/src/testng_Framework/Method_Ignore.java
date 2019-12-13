package testng_Framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Ignore {

	
	@Test(priority=0,description="Test for login invalid")
	public void tc001()
	{
		Reporter.log("Tc001 executed");
	}
	
	
	@Test(priority=1,enabled=false)  //Ignore method execution
	public void tc002()
	{
		Reporter.log("Tc002 executed");
	}
	
	@Test(priority=2)
	public void tc003()
	{
		Reporter.log("Tc001 executed");
	}

}
