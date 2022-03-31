package pizza_shop_ordering_system;

import java.util.Scanner;

public class PizzaStore {
	public static Pizza getPizza(int count) {
		Pizza p = null;
		Scanner sc = new Scanner(System.in);
		String name = "";
		int size = 0;
		int price = 0;
		switch (count) {
		case 1:
			name = "培根匹萨";
			System.out.print("请输入匹萨的克数：");
			double grammage = sc.nextDouble();
			System.out.print("请输入匹萨的大小：");
			size = sc.nextInt();
			System.out.print("请输入匹萨的价格：");
			price = sc.nextInt();
			Bacon_Pizza b = new Bacon_Pizza(name, price, size, grammage);
			p = b;
			break;
		case 2:
			name = "水果匹萨";
			System.out.print("请输入想要加入的水果：");
			String dosing = sc.next();
			System.out.print("请输入匹萨的大小：");
			size = sc.nextInt();
			System.out.print("请输入匹萨的价格：");
			price = sc.nextInt();
			Fruit_Pizza f = new Fruit_Pizza(name, price, size, dosing);
			p = f;
			break;
		}

		return p;
	}
}
