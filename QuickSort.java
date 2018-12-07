package com.testingPreparation;

class QuickSort{
	
	static int partition(int[] arr, int low, int high) {
		
		int i = low-1;
		int pivot = arr[high];
		for(int j = low;j < high-1;j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			//partition
			//pi is partitioning index
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	public static void main(String... args) {
		
		int[] arr = {10, 30, 20, 40, 60, 50};
		int low = 0, high = arr.length-1;
		
		quickSort(arr, low, high);
		
		for(int element:arr) {
			System.out.println(element);
		}
	}
}