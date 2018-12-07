package com.testingPreparation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManProblem {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\kalakambam.mahesh\\Documents\\New folder\\something2.txt";
		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Scanner sc = new Scanner(br);
		
		//sc.useDelimiter("\\Z");
		//System.out.println(sc.next());
		
		Set<String> set = new TreeSet<String>();
		String str;
		while(sc.hasNextLine()) {
			str = sc.nextLine();
			System.out.println(str);
			String[] s = str.split("\n");
			for(String name:s) {
				System.out.println(name);
			}
			for(int i = 0;i < s.length;i++) {
				String[] words = s[0].split(" ");
				for(int j = 0;j < words.length;j++) {
					set.add(words[i]);
				}
			}
		}
		System.out.println(set.size());
		for(String s: set) {
			System.out.println(s);
		}
	}

}
