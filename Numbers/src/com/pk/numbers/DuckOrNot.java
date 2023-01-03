package com.pk.numbers;

import java.util.Scanner;

public class DuckOrNot {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int digit,num = In.nextInt();
		boolean IsDuck = false;
		
		while(num!=0) { 
			digit=num%10;
			if(digit==0) {
				IsDuck=true;
				break;
			}
			num/=10;
		}
		if(IsDuck==true) {
			System.out.println("is a duck number");
		}else {
			System.out.println("is not a duck number");
		}
	}

}
