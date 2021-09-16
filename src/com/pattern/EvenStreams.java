package com.pattern;

import java.util.stream.Stream;

public class EvenStreams {
	public static void main(String[] args) {
		
		Stream.iterate(0, n->n+1)
		.limit(10).
		forEach(num->System.out.print(num));
	}

}
