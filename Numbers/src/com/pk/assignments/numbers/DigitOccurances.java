package com.pk.assignments.numbers;

import java.util.Scanner;

public class DigitOccurances {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int count = 0, dig, num=In.nextInt();
		int serc = In.nextInt();
		
		while(num!=0) {
			dig=num%10;
			if(dig==serc) {
				count++;
			}
			num/=10;
		}
		System.out.println(serc+" Occured "+count+" times");
	}

}
