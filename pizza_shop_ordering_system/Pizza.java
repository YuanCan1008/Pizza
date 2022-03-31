package pizza_shop_ordering_system;

public class Pizza {
	private String name;// 名称
	private int price;// 价格
	private int size;// 大小

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

	// 展示匹萨信息
	public String showInformation() {
		return "名称：" + this.name + "\n价格：" + this.price + "元\n大小：" + this.size + "寸";
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
