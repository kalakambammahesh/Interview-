package com.testingPreparation;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Mahesh";
		char[] arr = s.toCharArray();
		int count = 0;
		for(char s1: arr) {
			count++;
		}
		System.out.println(count);
		
		int index = 0;
		try {
			while(true) {
				s.charAt(index);
				index++;
			}
		} catch(Exception e) {
		}
		
		System.out.println(index);
	}

}
