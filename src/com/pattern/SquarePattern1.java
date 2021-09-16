package com.pattern;

public class SquarePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		for(int rows=1; rows<=n; rows++) {
			for(int col=1; col<=n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
