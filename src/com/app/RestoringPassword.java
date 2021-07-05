package com.app;

import java.util.Arrays;
import java.util.List;

public class RestoringPassword {

	/*
	 * https://codeforces.com/problemset/problem/94/A
	 * 
	 */

	public static void main(String[] args) {
		String binaryPassword = "01001100100101100000010110001001011001000101100110010110100001011010100101101100";
		List<String> binaryDigits = Arrays.asList("0100110000", "0100110010", "0101100000", "0101100010", "0101100100",
				"0101100110", "0101101000", "0101101010", "0101101100", "0101101110");
		int index = 0;
		String password = "";
		while (index < binaryPassword.length()) {
			String digit = binaryPassword.substring(index, Math.min(index + 10, binaryPassword.length()));
			if (binaryDigits.indexOf(digit) != -1) {
				password += binaryDigits.indexOf(digit);
			}
			index += 10;
		}
		System.err.println(password);

	}

}
