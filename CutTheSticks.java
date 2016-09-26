package com.agoda.code;

public class CutTheSticks {

	/**
	 * Main Method: The idea is to first get the minimum element from the array and deduct it from each array element 
	 * 				and updating the current array element. Doing this while keep checking for array size to be 0 
	 * 				i.e. when after deducting the minimum, all the array elements are 0. We are not removing any 0 element from the array
	 * 				instead ignoring the 0 elements.
	 * 				 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] sticks = { 3, 5, 2, 4, 7 };  //input array

		while (getCurrentSize(sticks) != 0) {
			print(sticks);
			int min = getMinimum(sticks);
			for (int i = 0; i < sticks.length; i++) {
				if (sticks[i] != 0) {
					int updatedLength = sticks[i] - min;
					sticks[i] = updatedLength;

				}
			}
		}

	}

	/**
	 * Method returns current size of the array i.e ignoring the sticks with 0 length.
	 * @param sticks
	 * @return
	 */
	private static int getCurrentSize(int[] sticks) {
		int size = 0;
		for (int i = 0; i < sticks.length; i++) {
			if (sticks[i] != 0) {
				size++;
			}
		}
		return size;
	}

	/**
	 * Method returns minimum from array
	 * @param sticks
	 * @return
	 */
	private static int getMinimum(int[] sticks) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < sticks.length; i++) {
			if (sticks[i] == 0) {
				continue;
			}
			if (min > sticks[i]) {
				min = sticks[i];
			}
		}
		return min;
	}

	/**
	 * Method prints the current size of the array denoting the number of sticks left.
	 * Also has print statement to show number of sticks left of remaining length after cut operation
	 * @param stickList
	 */
	private static void print(int[] stickList) {
		/*
		 * Prints remaining Stick length
		for (int i = 0; i < stickList.length; i++) {
			if (stickList[i] != 0) {

				System.out.print(stickList[i] + ",");
			}
		}*/
		
		System.out.println();
		System.out.println("total sticks:" + getCurrentSize(stickList));

	}

}
