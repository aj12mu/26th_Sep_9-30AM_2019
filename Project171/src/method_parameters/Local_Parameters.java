package method_parameters;

public class Local_Parameters 
{
	//Method without parameter
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	//Method with sigle parameter
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println(name);
	}
	
	//Method with multiple parameters
	public void print_tool(String toolname,double price)
	{
		String name=toolname;
		System.out.println(name+" price is => "+price);
	}
	
	

	public static void main(String[] args) 
	{
		
		//Create object for Class
		Local_Parameters obj=new Local_Parameters();
		//Calling method without argument
		obj.print_tool();
		obj.print_tool();
		System.out.println("\n");
		
		//Calling Method with arguments
		obj.print_tool("Cucumber");
		obj.print_tool("Selenium-IDE");
		
		//Calling method with multiple arguments
		obj.print_tool("Webdriver", 1200.00);

	}

}
