package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Creating_ExtentReports {

	public static void main(String[] args)
	{
		
		//path for html reports
		String filepath="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\src\\extent_reports//Myreports.html";
		
		//Create New Html file using extent_reports class
		ExtentReports reporter=new ExtentReports(filepath);
			
				//Create Reports for TC001
				ExtentTest login=reporter.startTest("Tc001_login");
				
						login.log(LogStatus.INFO, "Url Enter successfull");
						login.log(LogStatus.INFO, "Email enter successfull");
						login.log(LogStatus.INFO, "password enter successfull");
						login.log(LogStatus.INFO, "Signin button clicked");
						login.log(LogStatus.PASS, "Login output page displayed");

				reporter.endTest(login);  //Endtest
				
				
				//Create Reports for TC001
				ExtentTest reg=reporter.startTest("Tc002_registration");
						
				reg.log(LogStatus.INFO, "Url Enter successfull");
				reg.log(LogStatus.INFO, "Data entry completed");
				reg.log(LogStatus.FAIL, "User registration failed");
				
				reporter.endTest(reg); //End test
		
		reporter.flush();
		
		
	}

}
