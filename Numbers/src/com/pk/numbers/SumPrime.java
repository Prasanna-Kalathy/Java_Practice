package com.pk.numbers;

import java.util.Scanner;

public class SumPrime {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int digit,sum=0,num=In.nextInt();
		
		while(num!=0) {
			digit=num%10;
			if(digit==2 || digit==3 || digit==5 || digit==7) {
				sum+=digit;
			}
			num/=10;
		}
		System.out.println(sum);
	}
}
