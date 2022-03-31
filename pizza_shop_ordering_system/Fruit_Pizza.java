package pizza_shop_ordering_system;

public class Fruit_Pizza extends Pizza {
	private String dosing;

	public String getDosing() {
		return dosing;
	}

	public void setDosing(String dosing) {
		this.dosing = dosing;
	}

	public Fruit_Pizza() {
		super();
	}

	public Fruit_Pizza(String name, int price, int size, String dosing) {
		super(name, price, size);
		this.dosing = dosing;
	}

	public String showInformation() {
		return super.showInformation() + "\n≈‰¡œÀÆπ˚£∫" + this.dosing;
	}
}
