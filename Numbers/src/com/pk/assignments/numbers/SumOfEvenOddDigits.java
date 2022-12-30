package com.pk.assignments.numbers;

import java.util.Scanner;

public class SumOfEvenOddDigits {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int eve = 0,odd = 0,num=In.nextInt();
		
		while(num!=0) {
			if((num%10)%2==0) {
				eve+=(num%10);
			}
			else {
				odd+=(num%10);
			}
			num/=10;
		}
		System.out.println("Sum of Even Numbers= "+eve);
		System.out.println("Sum of Odd Numbers= "+odd);
	}

}
