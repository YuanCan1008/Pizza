package pizza_shop_ordering_system;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ��Ҫ������ƥ����1.���ƥ��  2.ˮ��ƥ��");
		int count = sc.nextInt();
		Pizza pizza = PizzaStore.getPizza(count);
		System.out.println(pizza.showInformation());
	}
}
