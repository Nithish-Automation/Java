package com.pattern;

import java.util.Scanner;

public class CumulativeSum {
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size=in.nextInt();
		if(size>0) {
			System.out.println("Enter the array elements: ");
			int a[]= new int[size];
			int sum[]= new int[size];
			int temp=0;
			for(int i=0;i<size;i++) {
				a[i]= in.nextInt();
				temp= a[i]+ temp;
				sum[i]= temp;
			}
			for(int i=0;i<size;i++) {
				System.out.print(sum[i]+ " ");
			}
		}
		else {
			System.out.println("Invalid Array size");		
		}
		in.close();
		
	}

}
