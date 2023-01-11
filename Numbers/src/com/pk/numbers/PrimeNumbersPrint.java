package com.pk.numbers;

import java.util.Scanner;

public class PrimeNumbersPrint {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Start Number");
		int st = In.nextInt();
		System.out.println("Enter the End Number");
		int end = In.nextInt();
		System.out.println("The Prime numbers between " + st + " and " + end + " are: ");
		for (int num = st; num <= end; num++) {
			boolean flag = false;
			if (num > 1) {
				for (int j = 2; j < num; j++) {
					if ((num % j) == 0) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.println(num);
				}
			}
		}
	}
}
