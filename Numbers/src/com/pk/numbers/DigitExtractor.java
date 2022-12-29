package com.pk.numbers;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int digit,num = In.nextInt();
		
		while(num!=0) {
			digit=num%10;
			System.out.print(digit+" ");
			num/=10;
		}

	}

}
