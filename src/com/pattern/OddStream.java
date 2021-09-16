package com.pattern;

import java.util.stream.Stream;

public class OddStream {
	public static void main(String[] args) {
		
		Stream.of(1, 2, 3, 4, 5)
//		.iterate(0, n->n+1)
		.filter(x->x%2!=0)
		.limit(10)
		.forEach(num->System.out.println(num));
	}

}
