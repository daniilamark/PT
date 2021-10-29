package com.daniilamark.university.lab_3;

public class Programm {
	public static void main(String[] args) {
		int[] array = {10, 2, 10, 3, 1, 2, 5};
		printArray(array);
		System.out.println();
		for (int left = 0; left < array.length; left++) {
			int minInd = left;
			for (int i = left; i < array.length; i++) {
				if (array[i] < array[minInd]) {
					minInd = i;
				}
			}
			swap(array, left, minInd);
		}
		printArray(array);
	}
	
	private static void swap(int[] array, int left, int minInd) {
		int tmp = array[left];
		array[left] = array[minInd];
		array[minInd] = tmp;
	}
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++){
		    System.out.print(array[i] + ",");
		}
	}
}

