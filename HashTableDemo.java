package com.testingPreparation;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Similat to hashSet but synchronized it a class
		
		Hashtable h = new Hashtable();
		Hashtable h1 = new Hashtable();
		
		h.put(1, "mahesh");
		h.put(2, "mahi");
		h.put(3, "ma");
		
		h1 = (Hashtable)h.clone();
		
		System.out.println("Before clear h" + h);
		System.out.println("Before clear h1" + h1);
		
		h.clear();
		System.out.println("After h :" + h);
		System.out.println("After h1:" +h1);
	}

}
