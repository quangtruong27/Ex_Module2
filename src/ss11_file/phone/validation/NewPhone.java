package ss11_file.phone.validation;

import ss11_file.phone.exception.EmptyFieldException;
import ss11_file.phone.exception.NegativeNumberException;

import java.util.Scanner;

public class NewPhone extends Phone {
	private int quantity;

	@Override
	public void input(Scanner sc) throws Exception {
		super.input(sc);

		System.out.print("Nhap so luong: ");
		String qtyStr = sc.nextLine();
		if (qtyStr.trim().isEmpty()) {
			throw new EmptyFieldException("So luong bat buoc nhap");
		}
		quantity = Integer.parseInt(qtyStr); // NumberFormatException
		if (quantity < 0) {
			throw new NegativeNumberException("So luong khong duoc am");
		}
	}


	public NewPhone() {
	}

	public NewPhone(String id, String namePhone, double price, int warranty, String manufacturer, int quantity) {
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

	@Override
	public double caculateTotalPrice() {
		return this.getPrice() * this.quantity;
	}

	@Override
	public String toString() {
		// ID,Name,Price,Warranty,Manu,Battery,Desc,Quantity
		return baseToCSV() + ",,," + quantity;
	}
}
