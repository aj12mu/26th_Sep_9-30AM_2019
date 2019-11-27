package corejava.arrays;

public class Single_Dimensional_Array 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Arrays:-->
		 * 		Arrays are list of variables which we
		 * 		refer to store into single reference variable.
		 * 		
		 * 		=> Array accept only similar values to store.
		 * 
		 * 		1. Static Array
		 * 		2. Runtime Array
		 */
		
		/*
		 * 1. Static Array:-->
		 * 			=> Static Array contains fix boundaries.
		 * 			=> During static array declaration time, Programmer
		 * 				should declare fixed boundaries and then store
		 * 				values to array w.r.t fixed range.
		 */
		
		
		String variable="WebDriver";
		System.out.println("Variable value is => "+variable);
		
		String arr[]=new String[3];
		arr[0]="firefox";
		arr[1]="chrome";
		arr[2]="safari";
		
		System.out.println("First index value is => "+arr[1]);
		
		
		/*
		 * Runtime Array:-->
		 * 			=> During this array programmer store set of
		 * 				value without defining any boundaries.
		 * 			
		 */
		
		//List of values to store into single variable
		String tools[]={"IDE","WD","RC","GRID"};
		System.out.println("First index value is => "+tools[1]);

		

	}

}
