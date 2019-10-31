package corejava.Variables;

public class String_Comparision_Methods {

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			String allow set of characters to store. And 
		 * 			String also called as class,Because string contains
		 * 			set of comparision commands..
		 */
		
		String act_res="account created";
		String exp_res="Account Created";
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings and
		 * 		return boolean value true/false.
		 */
		
		boolean flag=act_res.equals(exp_res);
		System.out.println("equal comparision status is => "+flag);
	
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify equal comparision between two string by
		 * 		ignoring casesensitive and return boolean value true/false;
		 */
		boolean flag1=act_res.equalsIgnoreCase(exp_res);
		System.out.println("Equalignorecase comparision is => "+flag1);

	}

}
