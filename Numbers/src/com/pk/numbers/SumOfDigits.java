package com.pk.numbers;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int sum = 0,num = In.nextInt();
		
		while(num!=0) {
			sum=sum+(num%10);
			num/=10;
		}
		System.out.println("Sum of All digits of is "+sum);
	}
}
