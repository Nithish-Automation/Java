package com.pattern;

import java.util.stream.Stream;

public class StringLength {

	public static void main(String[] args) {

		String name = "  Nithish   Athreya   ";
		char ch = name.charAt(0);
		System.out.println(ch);
		System.out.println();
		int index = name.indexOf("r");
		System.out.println(index);
		
		

		int num = name.replace(" ", "").trim().length();
		System.out.println(num);
		String str = name.replaceFirst("Nithish", "athreya");
		System.out.println(str);
		System.out.println(name.compareToIgnoreCase("athreya"));

		int a = 12;
		int b = 14;

		int c = a + b;

		System.out.println(c);

		Stream<String> ele = Stream.of("nithish", "athreya");
		ele.findFirst().ifPresent(System.out::println);

	}

}
