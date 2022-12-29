package com.pk.numbers;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		try (Scanner In = new Scanner(System.in)) {
			System.out.println("Enter the Year");

			int yr = In.nextInt();

			if (yr >= 999 && yr <= 10000) {
				if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0) {
					System.out.println(yr + " is a Leap Year");
				} else {
					System.out.println(yr + " is a Not a Leap Year");
				}
			} else {
				System.out.println("Not the recent year");
			}
		}
	}
}
