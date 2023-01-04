package com.pk.numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int dig, rev = 0, num = In.nextInt();
		int temp=num;
		while(num!=0) {
			dig=num%10;
			rev=(rev*10)+dig;
			num/=10;
		}
		if(temp==rev) {
			System.out.println("The number is a Palindrome");
		}else {
			System.out.println("The number is Not a Palindrome");
		}
	}

}
