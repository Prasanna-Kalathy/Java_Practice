package com.pk.numbers;

import java.util.Scanner;

public class SumPrime {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int sum=0,num=In.nextInt();
		
		while(num!=0) {
			sum+=num%10;
			if((sum%2)==0) {
				
			}
		}
	}

}
