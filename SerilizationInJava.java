package com.testingPreparation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationInJava implements Serializable {
	
	void display() {
		System.out.println("This is display...");
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerilizationInJava obj = new SerilizationInJava();
		System.out.println(obj.hashCode());
		
		//Serilizing the object...
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kalakambam.mahesh\\Documents\\New folder\\something.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(obj);
		
		//Deserilizing the object...
		
		FileInputStream fis = new FileInputStream("C:\\Users\\kalakambam.mahesh\\Documents\\New folder\\something.txt");
		ObjectInputStream in = new ObjectInputStream(fis);	
		SerilizationInJava newObj = (SerilizationInJava)in.readObject();
		System.out.println(newObj.hashCode());
		newObj.display();
	}

}
