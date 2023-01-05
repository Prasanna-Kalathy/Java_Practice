package com.pk.numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = In.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.println(a+"\n"+b);
		for(int i = 2;i<10;i++) {
			c = b+a;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
