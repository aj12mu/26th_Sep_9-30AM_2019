package modular_Framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

class Junit_Runner_With_Extent_Reports extends Testcases
{

	static ExtentReports reporter;
	ExtentTest test;
	static String Filepath="D:\\My_Junit_Extent_Reports.html";
	static String url="http://cleartrip.com";
	
	@Test
	void Verifying_Hotel_Search() 
	{
		Search_Hotel();  //From Testcases class
		test.log(LogStatus.INFO, "Hotel search completed");
	}
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		reporter=new ExtentReports(Filepath, true);
		launch_browser("chrome");
		load_webpage(url);
		set_timeout(30);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		reporter.flush();
		driver.close();
	}

	@BeforeEach
	void setUp(TestInfo testinfo) throws Exception 
	{
		//Get Aftereach annotation constucted methodname
		String methodName = testinfo.getTestMethod().get().getName();
		reporter.startTest(methodName);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		reporter.endTest(test);
	}


}
