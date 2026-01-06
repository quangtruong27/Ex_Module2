package ss4_ke_thua;

public class PhoneNew extends Phone {
	private int quantity;

	public PhoneNew() {
	}

	public PhoneNew(String id, String namePhone, double price, String warranty, String manufacturer, int quantity) {
		super(id, namePhone, price, warranty, manufacturer);
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public void showInfo() {
		System.out.println("ID: " + getId() + " | " + "Name: " + getNamePhone() + " | " + "Price: " + getPrice() + " | " + "Warranty: " + getWarranty() + " | " + "Manufacturer: " + getManufacturer() + " | " + "Quantity: " + quantity);
	}
}
