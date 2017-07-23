package com.Assignment1;

import java.util.Scanner;

public class SumOfNumbers {

	/**
	 * @param args
	 * Main method to accept two numbers from the user and show their sum
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Ask the user to enter the value for a
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		//Ask the user to enter the value for b
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		//Display the sum of values of a and b 
		System.out.println("Sum of two numbers :: "+Add(a,b));

	}
	
	/**
	 * Method to add two numbers
	 */
	static int Add(int x, int y)
	{
	    // Iterate till there is no carry  
	    while (y != 0)
	    {
	        // carry now contains common set bits of x and y
	        int carry = x & y;  
	 
	        // Sum of bits of x and y where at least one of the bits is not set
	        x = x ^ y; 
	 
	        // Carry is shifted by one so that adding it to x gives the required sum
	        y = carry << 1;
	    }
	    return x;
	}
}
