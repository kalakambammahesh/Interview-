package com.testingPreparation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileBufferedReader {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\kalakambam.mahesh\\Documents\\test.txt";
		try {
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = null;
			while((str =br.readLine()) != null) {
				System.out.println(str);
			}
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFound" + e.getMessage());
		}
		

	}

}
