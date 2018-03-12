package com.boco.sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		quickSort(array, 0, array.length - 1);
		for(int i : array) {
			System.out.print(i);
		}
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
