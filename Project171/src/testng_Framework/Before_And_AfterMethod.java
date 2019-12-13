package testng_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_And_AfterMethod 
{
  
	  @Test //Invoke method to run.
	  public void Tc001() 
	  {
		  //Generate report at HTML file 
		  Reporter.log("Tc001 Executed",true);
	  }
	  
	  @Test //Invoke method to run.
	  public void Tc002() 
	  {
		  //Generate report at HTML file 
		  Reporter.log("Tc002 Executed",true);
	  }
	  
	  @Test //Invoke method to run.
	  public void Tc003() 
	  {
		  //Generate report at HTML file 
		  Reporter.log("Tc003 Executed",true);
	  }
	  

	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("Method-precondition");
	  }
	
	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("Method-post-condition"+"\n");
	  }

}
