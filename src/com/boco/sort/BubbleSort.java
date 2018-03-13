package com.boco.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		sort(array);
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
