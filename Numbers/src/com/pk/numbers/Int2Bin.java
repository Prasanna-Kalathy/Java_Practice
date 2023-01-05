package com.pk.numbers;

import java.util.Scanner;

public class Int2Bin {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = In.nextInt();
		int bin[] = new int[10];
		
		int i=0;
		while(num!=0) {
			bin[i] = num%2;
			num/=2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(bin[j]);
		}
	}

}
