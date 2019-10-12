package corejava.InstantMethods;

public class Run_Robot 
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
		obj.run();
		obj.walk();
		
	

	}

}
