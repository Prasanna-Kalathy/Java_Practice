package com.pk.assignments.numbers;

import java.util.Scanner;

public class SumOfFact3 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int sum=0,dig,num = In.nextInt();
		
		while(num!=0) {
			dig=num%10;
			if((dig%3)==0) {
				sum+=dig;
			}
			num/=10;
		}
		System.out.println(sum);
		
	}

}
