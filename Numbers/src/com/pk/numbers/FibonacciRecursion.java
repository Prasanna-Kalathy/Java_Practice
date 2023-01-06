package com.pk.numbers;

import java.util.Scanner;

public class FibonacciRecursion {
	static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = In.nextInt();
		for (int i=0;i<n;i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}
}