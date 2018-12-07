package com.testingPreparation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingScanner {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\kalakambam.mahesh\\Documents\\test.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
