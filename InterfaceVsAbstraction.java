package com.testingPreparation;

public  class InterfaceVsAbstraction {
	
	abstract class Phone{
		protected void calling(){
			System.out.println("calling");
		}
		abstract public void messaging();
		abstract public void camera();
	}
	
	interface AndroidPhone{
		 String name ="";
		 void bluetooth();
		 void wifi();
	}
	
	abstract class Nokia extends Phone implements AndroidPhone{
		Nokia(){
			System.out.println("Nokia calss constructor");
		}
		int age;
		{
			age = 24;
		}
		public void messaging() {
			System.out.println("messaginh");
		}
	}
	
	class Samsung extends Nokia{
		public void bluetooth() {
			System.out.println("blueetooth");
		}
		public void wifi() {
			System.out.println("wifi");
		}
		public void camera() {
			System.out.println("camera");
		}
	}

	public static void main(String[] args) {
		InterfaceVsAbstraction.Samsung samsung = new InterfaceVsAbstraction().new Samsung();
		samsung.bluetooth();
		samsung.calling();
		samsung.camera();
		samsung.messaging();
		System.out.println(samsung.name);
		System.out.println(samsung.age);
		
		//samsung.calling();
	}

}
