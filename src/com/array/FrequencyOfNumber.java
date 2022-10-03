package com.array;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 8, 6, 1, 5, 6 };
		int[] array2 = new int[array1.length];

		int visited = -1;
		for (int i = 0; i < array1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array2.length; j++) {

				if (array1[i] == array2[j]) {
					count++;

					array2[j] = visited;
				}
			}
			if (array2[i] == visited) {
				array2[i] = count;
			}
			System.out.println("Element" + " | " + " frequency ");
			for (i = 0; i < array2.length; i++) {
				if (array2[i] != visited) {
					System.out.println(array1[i] + " | " + array2[i]);
				}
			}
		}
	}
}
