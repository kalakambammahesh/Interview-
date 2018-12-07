package com.testingPreparation;

class TestA{
	void add() {
		System.out.println("This is add in A");
	}
}

class TestB extends TestA{
	void add() {
		System.out.println("This is add in B");
	}
}
public class PolyMorphismEx {

	public static void main(String[] args) {
		//TestB Obj = (TestB)new TestA();//RunTime Exception can't type to subclass.
		//Obj.add();

	}

}
