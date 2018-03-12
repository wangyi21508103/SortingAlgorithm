package com.boco.sort;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = {6, 9, 7, 8, 5, 6, 3, 1, 2};
		quickSort(array, 0, array.length - 1);
		System.out.print(Arrays.toString(array));
	}
	
	public static void quickSort(int[] array, int left, int right) {
		int i = left;
		int j = right;
		int base = array[left];
		while(left < right) {
			while(left < right && base < array[right]) {
				right--;
			}
			swap(array, left, right);
			while(left < right && base > array[left]) {
				left++;
			}
			swap(array, left, right);
		}
		if(i < left - 1) {
			quickSort(array, i, left - 1);
		}
		if(right + 1 < j) {
			quickSort(array, right + 1, j);
		}
	}
	
	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
