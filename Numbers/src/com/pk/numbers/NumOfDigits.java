package com.pk.numbers;

import java.util.Scanner;

public class NumOfDigits {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int count=0,num= In.nextInt();
		
		while(num!=0) {
			count++;
			num/=10;
		}
		System.out.println(count);
	}
}
