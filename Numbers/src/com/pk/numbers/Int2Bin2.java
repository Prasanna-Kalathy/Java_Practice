package com.pk.numbers;

import java.util.Scanner;

public class Int2Bin2 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = In.nextInt();
		System.out.println(Integer.toBinaryString(num));
	}

}
