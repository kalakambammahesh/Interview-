package com.testingPreparation;

public class MinimumSwapsSortingWithZero {

	public static void main(String[] args) {
		int[] arr= {5, 4, 3, 2, 1, 0};
		int swapCount = 0;
		for(int i = 0;i < arr.length-1;i++) {
			while(arr[i] != i) {
				int swapKey = arr[i];
				
				int temp = arr[i];
				arr[i] = arr[swapKey];
				arr[swapKey] = temp;
				System.out.println(arr[i] + arr[swapKey]);
				swapCount++;
			}
		}
		
		System.out.println(swapCount);
		for(int i: arr) {
			System.out.println(i+" ");
		}
	}

}
