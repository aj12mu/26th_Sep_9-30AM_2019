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

		
		/*
		 * contains:-->
		 * 		Method verify partial sequence of characters available at
		 * 		String and return boolean value true/false.
		 */
		String status="Account Created 100 successfull";
		boolean flag2=status.contains("101");
		System.out.println("Sub string available status is => "+flag2);
		
		
		/*
		 * length:-->
		 * 		Method return count of characters available with in string
		 * 		and return value in integer format.
		 */
		String mobile="9030248855";
		int len=mobile.length();
		System.out.println("Mobile number length is => "+len);
		
		if(len==10)
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
		
		
		/*
		 * SubString:-->
		 * 		method get substring from mainstring
		 */
		String Account_num="1234123455550001";
		String Last_digit_num=Account_num.substring(12);
		System.out.println("Last 4 digit mobile number is => "+Last_digit_num);
		
		String First_digit_num=Account_num.substring(0,4);
		System.out.println("First 4 digit number is => "+First_digit_num);
		
		
		/*
		 * StartsWith:-->
		 * 		Method verify expected string start with sequence of characters
		 * 		and return boolean value true/false.
		 */
		String IFSC_Code="HDFC00011";
		boolean flag3=IFSC_Code.startsWith("HDFC");
		System.out.println("Start with status is => "+flag3);
		
		
		/*
		 * StartsWith:-->
		 * 		Method verify expected string ends with sequence of characters
		 * 		and return boolean value true/false.
		 */
		
		String Code="HDFC00011";
		boolean flag4=Code.endsWith("0011");
		System.out.println("ends with status is => "+flag4);
		
		

		/*
		 * Trim:-->
		 * 		Method trim extra spaces available at string.
		 */
		String Pincode="    500076     ";
		System.out.println("before trim pincode length is => "+Pincode.length());
		String New_pincode=Pincode.trim();
		System.out.println("After trim pincode length is => "+New_pincode.length());
		
		
		/*
		 * ISempty:-->
		 * 		Method verify string empty status in boolean format.
		 */
		String product1="";
		String product2="Iphone";
		
		System.out.println("product1 empty status is => "+product1.isEmpty());
		System.out.println("product2 empty status is => "+product2.isEmpty());
		
		
		//Convert lowercase charactes to uppercase
		String Ucase="selenium".toUpperCase();
		System.out.println(Ucase);
		
		//convert uppercase characters to lowercase
		String Lcase="SELENIUM".toLowerCase();
		System.out.println(Lcase);
		
		
		/*
		 * Split;-->
		 * 		Method split string using delimeter and store value
		 * 		into array.
		 */
		String result="Product1,Product2,Product3";
		String arr[]=result.split(",");
		System.out.println(arr[0]+"   "+arr[1]+"    "+arr[2]);
		
		
	}

}
