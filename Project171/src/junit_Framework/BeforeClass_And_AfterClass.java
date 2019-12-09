package junit_Framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeClass_And_AfterClass 
{

	@Test
	void Tc001() 
	{
		System.out.println("Tc001 executed");
	}
	
	@Test
	void Tc002() 
	{
		System.out.println("Tc002 executed");
	}
	
	@Test
	void Tc003() 
	{
		System.out.println("Tc003 executed");
	}
	

	@BeforeAll //Invoke before execution of first @Test annotation with in class
	static void setUpBeforeClass() throws Exception
	{
		System.out.println("Class_precondition");
	}

	@AfterAll //Invoke after execution of last @Test annotation with in class
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class_postcondition");
	}


}
