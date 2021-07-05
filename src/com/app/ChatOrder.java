package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChatOrder {

	/*
	 * https://codeforces.com/problemset/problem/637/B
	 * 
	 */
	public static void main(String[] args) {
		List<String> names = Arrays.asList("alex", "ivan", "roman", "ivan");
		List<String> sortedNames = new ArrayList<>();
		for (int i = names.size() - 1; i >= 0; i--) {
			String name = names.get(i);
			if (!sortedNames.contains(name))
				sortedNames.add(name);
		}
		System.err.println(sortedNames);

	}

}
