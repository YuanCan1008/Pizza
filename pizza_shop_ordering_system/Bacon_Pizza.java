package pizza_shop_ordering_system;

public class Bacon_Pizza extends Pizza {
	private double grammage;

	public double getGrammage() {
		return grammage;
	}

	public void setGrammage(double grammage) {
		this.grammage = grammage;
	}

	public Bacon_Pizza() {
		super();
	}

	public Bacon_Pizza(String name, int price, int size, double grammage) {
		super(name, price, size);
		this.grammage = grammage;
	}

	public String showInformation() {
		return super.showInformation() + "\nÅà¸ù¿ËÊý£º" + this.grammage + "g";
	}
}
