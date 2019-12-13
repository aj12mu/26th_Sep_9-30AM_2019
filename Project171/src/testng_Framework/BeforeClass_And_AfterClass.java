package testng_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
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
	  
	
 
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("Class - Precondition");
	
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Class-PostCondition");
	  Assert.assertEquals(true, false);
	 
  }

}
