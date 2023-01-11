package com.pk.numbers;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int dig, sum = 0, prod = 1, num = In.nextInt();
		int temp = num;
		while (num != 0) {
			dig = num % 10;
			sum += dig;
			prod *= dig;
			num /= 10;
		}
		if (temp == (sum + prod)) {
			System.out.println(temp + " is a Special Number");
		} else
			System.out.println(temp + " is Not a Special Number");
	}

}
