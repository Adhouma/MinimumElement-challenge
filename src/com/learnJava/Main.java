package com.learnJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/**
	 * Write a method called readIntegers() with a parameter called count that represents 
	 * how many integers the user needs to enter.
	 * The method needs to read from the console until all the numbers are entered, 
	 * and then return an array containing the numbers entered.
	 * Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
	 * In the main() method read the count from the console and call the method readIntegers() with the count parameter. 
	 * Then call the findMin() method passing the array returned from the call to the readIntegers() method.
	 * Finally, print the minimum element in the array.
	 */
	public static void main(String[] args) {
		int[] myNumbers = readIntegers(5);
		System.out.println("My numbers = " + Arrays.toString(myNumbers));
		
		int min = findMin(myNumbers);
		System.out.println("Minimum = " + min);
	}

	static Scanner scanner = new Scanner(System.in);
	
	public static int[] readIntegers(int count) {
		System.out.println("How many numbers you want to enter ?");
		count = scanner.nextInt();
		
		int[] myNumbers = new int[count];
		for(int i = 0; i < count; i++) {
			System.out.println("Enter number #" + (i+1));
			myNumbers[i] = scanner.nextInt();
		}
		return myNumbers;
	}
	
	public static int findMin(int[] array) {
		int[] copiedArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			copiedArray[i] = array[i];
		}

		boolean findMin = false;
		int min = copiedArray[0];
		while(!findMin) {
			findMin = true;
			for(int i = 0; i < copiedArray.length; i++) {
				if(copiedArray[i] < min) {
					min = copiedArray[i];
					findMin = false;
				}
			}
		}
		return min;
	}
}
