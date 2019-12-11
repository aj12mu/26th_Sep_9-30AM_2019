package junit_Framework;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectPackages("junit_Framework")
@SelectClasses( Myjunit_Test.class )
public class Junit_Suite_Runner 
{
	

}
