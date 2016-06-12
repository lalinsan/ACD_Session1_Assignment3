/*
 * Student: Eduardo Aguirre
 * Session 1
 * Assignment 4
 * Give two examples of data that cannot be stored in a variable of type int.
 */



public class InvalidIntegers {

	public static void main(String[] args) {
		// INVALID Data that cannot stored as Integers
		//int a=true; A boolean Value cannot be stored as an Integer
		//int b="String" A string cannot be be stored as an Integer
		//int c=5.6f //A float cannot be be stored as an Integer
		//int d='A' A char cannot be stored as Integers
		
		//VALID Integers
		int a=10;
		int b=a+5;
		int c=128;
		int d= (a+b+c);
		
		System.out.println(" Integer d: " +d);

	}

}
