package modular_Framework;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Junit_Testcase_Runner extends Testcases
{

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		launch_browser("chrome");
		load_webpage("http://cleartrip.com");
		set_timeout(30);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		driver.close(); //driver is global variable from keyword class
	}

	@Test
	void Tc001_verify_HotelSearch() 
	{
		Search_Hotel();
	}

}
