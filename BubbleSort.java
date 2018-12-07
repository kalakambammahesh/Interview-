package com.testingPreparation;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int endPosition = 1;
		while(endPosition > 0) {
			endPosition = 0;
			int swapPosition = 0;
			for(int i = 0;i < n-1;i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapPosition = i;
				}
			}
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			endPosition = swapPosition;
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
