package junit_Framework;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Before_method_And_AfterMethod {

	@BeforeEach
	void setUp() throws Exception
	{
		System.out.println("Pre-method");
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		System.out.println("post-method"+"\n");
	}

	@Test
	void Tc001() 
	{
		System.out.println("Tc001 executed");
	}
	
	@Disabled //Ignore method execution
	void Tc002() 
	{
		System.out.println("Tc002 executed");
	}
	
	@Test
	void Tc003() 
	{
		System.out.println("Tc003 executed");
	}
	
	//Without @Test junit simply ignore execution of method.
	void Tc004() 
	{
		System.out.println("Tc003 executed");
	}

}
