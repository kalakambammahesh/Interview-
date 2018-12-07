package com.testingPreparation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) {
		try {
			FileReader  fr = new FileReader("C:\\Users\\kalakambam.mahesh\\Documents\\test.txt");
			int i = 0;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
