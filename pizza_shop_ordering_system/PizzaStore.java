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
			name = "���ƥ��";
			System.out.print("������ƥ���Ŀ�����");
			double grammage = sc.nextDouble();
			System.out.print("������ƥ���Ĵ�С��");
			size = sc.nextInt();
			System.out.print("������ƥ���ļ۸�");
			price = sc.nextInt();
			Bacon_Pizza b = new Bacon_Pizza(name, price, size, grammage);
			p = b;
			break;
		case 2:
			name = "ˮ��ƥ��";
			System.out.print("��������Ҫ�����ˮ����");
			String dosing = sc.next();
			System.out.print("������ƥ���Ĵ�С��");
			size = sc.nextInt();
			System.out.print("������ƥ���ļ۸�");
			price = sc.nextInt();
			Fruit_Pizza f = new Fruit_Pizza(name, price, size, dosing);
			p = f;
			break;
		}

		return p;
	}
}
