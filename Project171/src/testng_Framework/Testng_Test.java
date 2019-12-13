package testng_Framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Test 
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
  
  
  
  
  
}
