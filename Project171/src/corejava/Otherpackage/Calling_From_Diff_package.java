package corejava.Otherpackage;

import corejava.InstantMethods.Robot;
import corejava.StaticMethods.InputDevices;

public class Calling_From_Diff_package 
{
	public static void main(String[] args) 
	{
		/*
		 * Inorder to call Instant method, We should
		 * create object for class.
		 * Syntax:-->
		 * 			Classname obj=new classname();
		 * 			obj.methonname();
		 */
		Robot obj=new Robot();
		obj.walk();
		obj.run();
		
		/*
		 * Inorder to call static methods, No need of
		 * object creation.
		 * 	
		 * 	Syntax:-->
		 * 			Classname.methodname();
		 */
		InputDevices.Keyboard();
		InputDevices.Mouse();
		
	}

}
