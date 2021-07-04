package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestoringPassword {

	/*
	 * https://codeforces.com/problemset/problem/94/A
	 * 
	 */

	public static void main(String[] args) {
		String input = "01001100100101100000010110001001011001000101100110010110100001011010100101101100";
		List<String> binaryPassword = new ArrayList<String>();
		int index = 0;
		while (index < input.length()) {
			System.err.println(input.substring(index, Math.min(index + 10, input.length())));
			binaryPassword.add(input.substring(index, Math.min(index + 10, input.length())));
			index += 10;
		}
		String password = binaryPassword.stream().map(b -> b.toString()).collect(Collectors.joining());
		System.err.println(password);

	}

}
