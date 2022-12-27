package com.pk.numbers;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = In.nextInt();
		
		if(num<=0) {
			System.out.println("Invalid number try again");
			throw new IllegalArgumentException(num+" is not a valid operator");
		}
		else if ((num%2)==0) {
			System.out.println(num+" Is a Even");
		}
		else {
			System.out.println(num+" Is a Odd");
		}
	
		
	}

}
