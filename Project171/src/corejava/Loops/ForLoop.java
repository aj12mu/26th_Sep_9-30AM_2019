package corejava.Loops;

public class ForLoop {

	public static void main(String[] args) 
	{
		//Example print numbers form 1 to 10 using increment
		for (int i =1; i <=10; i++) 
		{
			System.out.println(i+"=> Hi");
		}
		
		
		//Print number 10 to 1 usind decrement
		for (int i = 10; i >=1 ; i--) 
		{
			System.out.println(i+" => hello");
		}
		
		
		//How to reverse a string
		String toolname="webdriver";
		char[] c=toolname.toCharArray();
		for (int i = c.length-1; i >=0; i--) 
		{
			char ch=toolname.charAt(i);
			System.out.println(ch);
		}
		
		
		//Conduct sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is => "+sum);
		
		
		
		
		//Array values to iterate using for-loop
		String tools[]= {"IDE","RC","WD","GRID"};
		//Iterate for number of array length
		for (int i = 0; i < tools.length; i++) 
		{
			System.out.println(tools[i]);
		}
		

	}

}
