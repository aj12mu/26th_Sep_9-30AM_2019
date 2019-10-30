package corejava.Variables;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		
		/*
		 * byte:-->
		 * 			=> Integer datatype only accept numbers to store
		 * 			=> Min value is -128  &  max value is 127
		 * 			=> default value is 0
		 */
		byte a=127;
		System.out.println("Max value can store into byte is => "+a);
		
		
		/*
		 * int:-->
		 * 			=> Integer datatype only stores numbers
		 * 			=> Default value is zero.
		 */
		int x=1000000;
		int y=2000000;
		int z=x+y;
		System.out.println("Total value is => "+z);
		
		
		
		/*
		 * boolean:-->
		 * 			=> Boolean is a single bit datatype it store
		 * 					only true/false.
		 * 			=> Default value is false.
		 */
		boolean status=true;
		boolean flag=false;
		System.out.println("Status value is => "+status);
		System.out.println("flag value is => "+flag);
		
		
		/*
		 * double:-->
		 * 			=> Accept decimal values to store.
		 * 			=> Default value is null.
		 */
		double p1=100.50;
		double p2=100.50;
		double total=p1+p2;
		System.out.println("total value is => "+total);
		
		
		/*
		 * char:-->
		 * 		 => Accept single character
		 */
		char group='A';
		System.out.println("single character is => "+group);
		
		
		/*
		 * String:-->
		 * 			=> String accept set of characters to store.
		 * 			=> default value is  null.
		 */
		String name="MQDSNR";
		String email="info.dsnr@gmail.com";
		String mobile="9030248855";
		
		System.out.println(name+"    "+email+"     "+mobile);
		
		
	}

}
