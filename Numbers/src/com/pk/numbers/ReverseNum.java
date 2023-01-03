package com.pk.numbers;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int rev = 0,dig,num =In.nextInt();
		
		while(num!=0) {
			dig=num%10;
			rev=rev*10+dig;
			num/=10;
		}
		System.out.println(rev);
	}

}
