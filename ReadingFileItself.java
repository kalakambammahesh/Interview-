package com.testingPreparation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileItself {

	public static void main(String[] args)  {
		String path = "C:\\Users\\kalakambam.mahesh\\Documents\\test.txt";
		File file = new File(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
