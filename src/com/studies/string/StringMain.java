package com.studies.string;

public class StringMain {
	
	private static final String HELLO_WORLD = "Hello World!";

	public static void main(String[] args) {
		System.out.println("INDENT METHOD EXAMPLE:");
		
		String helloWorld = HELLO_WORLD;
		System.out.println(helloWorld.indent(10));
		
		System.out.println("TRANSFORM METHOD EXAMPLE:");
		helloWorld = HELLO_WORLD;
		
		helloWorld = helloWorld.transform(s -> s + "!!!!!!");
		System.out.print(helloWorld);
		
		System.out.println();
		helloWorld = helloWorld.transform(s -> s + "!!!!!!").transform(s -> s.concat(" Using transform() method twice."));
		System.out.print(helloWorld);
	}
}
