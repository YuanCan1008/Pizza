package pizza_shop_ordering_system;

public class Pizza {
	private String name;// ����
	private int price;// �۸�
	private int size;// ��С

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// չʾƥ����Ϣ
	public String showInformation() {
		return "���ƣ�" + this.name + "\n�۸�" + this.price + "Ԫ\n��С��" + this.size + "��";
	}

	public Pizza() {
		super();
	}

	public Pizza(String name, int price, int size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}

}
