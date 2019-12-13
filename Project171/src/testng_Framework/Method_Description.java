package testng_Framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description {

	
	@Test(description="Verifying login with valid data")
	public void tc001()
	{
		Reporter.log("Tc001 executed");
	}
}
