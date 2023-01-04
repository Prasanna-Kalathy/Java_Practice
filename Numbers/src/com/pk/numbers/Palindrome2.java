package com.pk.numbers;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		String num = In.next();
		StringBuffer sb = new StringBuffer(num);
		String rev = sb.reverse().toString();
		if(num.equals(rev)) {									//we can't use == here  
			System.out.println("The number is a Palindrome");
		}else {
			System.out.println("The number is Not a Palindrome");
		}
		
	}

}
