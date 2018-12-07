import java.util.Scanner;

interface food{
	public String getType();
}

class Pizza implements food{

	@Override
	public String getType() {
		
		return "Some one ordered Pizza";
	}
	
}

class Cake implements food{
	@Override
	public String getType() {
		return "Some one ordered Dessert";
	}
}

class FoodFactory{
	public food getFood(String order) {
		if(order.equals("cake")) return new Cake();
		else return new Pizza();
	}
}

public class FactoryMethodPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodFactory obj = new FoodFactory();
		
		food obj1 = obj.getFood(sc.next());
		System.out.println(obj1.getClass().getName());
		System.out.println(obj1.getType());
	}

}
