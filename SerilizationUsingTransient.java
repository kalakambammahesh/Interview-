package com.testingPreparation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	String name;
	transient int a;
	static int b;
	int age;
	
       public Employee(String name, int a, int b, int age){
		this.name = name;
		this.a = a;
		this.b = b;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + " b=" + b +  ", a=" + a + ", age=" + age + "]";
	}
       
       
}

public class SerilizationUsingTransient {
	public static void printDetails(Employee obj) {
		System.out.println("Name:" + obj.name);
		System.out.println("A :" + obj.a);
		System.out.println("B:" + obj.b);
		System.out.println("Age:" + obj.age);
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Employee obj = new Employee("Mahesh", 100, 200, 24);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\kalakambam.mahesh\\Documents\\New folder\\something1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			obj.b = 1000000;
			//obj.a = 11;
			obj.age= 23;
			obj.name = "mahesh";
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\kalakambam.mahesh\\Documents\\New folder\\something1.txt");
			ObjectInputStream ios = new ObjectInputStream(fis);
			Employee e = (Employee) ios.readObject();
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
