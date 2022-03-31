package pizza_shop_ordering_system;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择要制作的匹萨：1.培根匹萨  2.水果匹萨");
		int count = sc.nextInt();
		Pizza pizza = PizzaStore.getPizza(count);
		System.out.println(pizza.showInformation());
	}
}
