package com.pk.numbers;

import java.util.Scanner;

public class CreditScoreChecker {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Your Credit Score");
		int Cs = In.nextInt();

		if (400 <= Cs && Cs <= 600) {
			System.out.println("You can have Silver Card");
		} else if (600 <= Cs && Cs <= 800) {
			System.out.println("You can have Gold Card");
		} else if (800 <= Cs && Cs <= 850) {
			System.out.println("You can have Platinum Card");
		} else {
			System.out.println("Not a Expected Credit Score");
		}

	}

}
