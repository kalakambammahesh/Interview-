package com.testingPreparation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingUsingScannerUsingDelimiter {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\kalakambam.mahesh\\Documents\\test.txt");
			Scanner sc = new Scanner(file);
			sc.useDelimiter("\\Z");
			System.out.println(sc.next());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
