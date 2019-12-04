package method_return_types;

public class Method_Types 
{	
	public void method1()
	{
		/*
		 * 	Void is method type It doesn't return any value
		 *	to method name
		 */
	}
	
	/*
	 *  => Othethan void all method are return types, 
	 *  => we should return keyword at end of the method
	 *  => Return value should match with method types.
	 *  => Finally value return to method.
	 */
	
	public String method2()
	{
		String name="webdriver";
		return name;
	
	}
	
	
	public int method3()
	{
		return 100;
	}
	
	
	

	public static void main(String[] args)
	{
		
		//Create object for Class
		Method_Types obj=new Method_Types();
		//Calling Void method
		obj.method1();
		
		//Call other return type methods
		String toolname=obj.method2();
		System.out.println("method return String value as => "+toolname);
		
		int value=obj.method3();
		System.out.println("method return interger value as => "+value);
		
		
	}

}
