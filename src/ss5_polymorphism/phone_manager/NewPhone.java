package ss5_polymorphism.phone_manager;

import java.util.Scanner;

public class NewPhone extends Phone {
	private int quantity;

	@Override
	public void input(Scanner sc){
		super.input(sc);
		System.out.print("Nhap so luong: ");
		quantity = sc.nextInt();
		sc.nextLine();
	}

	public NewPhone() {
	}

	public NewPhone(String id, String namePhone, double price, String warranty, String manufacturer, int quantity) {
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
		super.showInfo();
		System.out.println(" | Quantity: " + quantity);
	}
}
