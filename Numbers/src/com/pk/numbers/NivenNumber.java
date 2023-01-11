package com.pk.numbers;

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int sum = 0,num = In.nextInt();
		int temp = num;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		if (temp % sum == 0) {
			System.out.println(temp + " is a Niven Number");
		} else {
			System.out.println(temp + " is Not a Niven Number");
		}
		In.close();
	}

}
