package com.app;

public class VanyaAndFence {

	/*
	 * https://codeforces.com/contest/677/problem/A
	 * 
	 */
	public static void main(String[] args) {
		Integer numberOfFriends = 6;
		Integer fenceHeight = 5;
		Integer[] personsHeight = { 7, 6, 8, 9, 10, 5 };
		Integer result = getMinimumPossibleWidthOfRoad(numberOfFriends, fenceHeight, personsHeight);
		System.err.println(result);
	}

	private static Integer getMinimumPossibleWidthOfRoad(Integer numberOfFriends, Integer fenceHeight,
			Integer[] personsHeight) {
		if (personsHeight.length > numberOfFriends || personsHeight.length < numberOfFriends) {
			throw new IllegalArgumentException("number of Person is not Equal the height of persons. !!");
		}
		Integer result = 0;
		for (Integer height : personsHeight) {
			if (height > fenceHeight) {
				result += 2;
			} else {
				result += 1;
			}
		}
		return result;
	}

}
