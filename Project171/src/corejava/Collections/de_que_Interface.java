package corejava.Collections;

import java.util.ArrayDeque;
import java.util.Collection;


public class de_que_Interface
{
	
	public static void main(String args[])
	{
	  // Creating an empty ArrayDeque 
        Collection<String> de_que = new ArrayDeque<String>(); 

        // Use add() method to add elements into the Deque 
        de_que.add("Welcome"); 
        de_que.add("To"); 
        de_que.add("Geeks"); 
        de_que.add("4"); 
        de_que.add("Geeks"); 
        
        //Convert into array
        Object arr[]=de_que.toArray();
        for (Object object : arr) 
        {
			System.out.println(object);
		}
       
        // Displaying the ArrayDeque 
        System.out.println("ArrayDeque: " + de_que); 
    } 

}
