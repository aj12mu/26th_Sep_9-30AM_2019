package datadriven.Excel;

import java.util.Scanner;

public class Expected_Rows_Datato_Iterate_Using_Scanner {

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Start Row Number:-> ");
		int itr_start=sc.nextInt();
		
		System.out.println("Enter End Row Number:--> ");
		int itr_end=sc.nextInt();
		
		for (int i = itr_start; i <= itr_end; i++) 
		{
			System.out.println(i);
		} 
		
		
		
		
	}

}
