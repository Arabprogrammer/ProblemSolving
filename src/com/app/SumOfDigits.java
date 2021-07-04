package com.app;

public class SumOfDigits {

	/*
	 * https://codeforces.com/contest/102/problem/B
	 * 
	 */
	public static void main(String[] args) {
		Integer result = findHowMany(991);
		System.err.println(result);
	}

	private static Integer findHowMany(Integer input) {
		if (input < 10) {
			return 0;
		}
		Integer counter = 1;
		Integer tempSum = sum(input);
		while (tempSum >= 10) {
			++counter;
			tempSum = sum(tempSum);

		}
		return counter;
	}
	
	private static Integer sum(Integer number) {
		Integer sum = 0;
		Integer digit = 0;
		while (number > 0) {
			// finds the last digit of the given number
			digit = number % 10;
			// adds last digit to the variable sum
			sum = sum + digit;
			// removes the last digit from the number
			number = number / 10;
		}
		return sum;
	}

}
