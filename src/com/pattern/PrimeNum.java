package com.pattern;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNum {

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		else {
		return !IntStream.rangeClosed(2, number/2).anyMatch(x->number%x==0);
		}
	}

	public static void main(String[] args) {

//		System.out.println(isPrime(19));
		
		Stream.iterate(0, n->n+1).filter(PrimeNum::isPrime).limit(10).forEach(x->System.out.println(x));
	}

}
