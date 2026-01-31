package ss10_exception.phone;

import ss10_exception.phone.exception.EmptyFieldException;
import ss10_exception.phone.exception.NegativeNumberException;

import java.util.Scanner;

public abstract class Phone implements Comparable<Phone> {
	private String id;
	private String namePhone;
	private double price;
	private String warranty;
	private String manufacturer;

	public Phone() {
	}

	public Phone(String id, String namePhone, double price, String warranty, String manufacturer) {
		this.id = id;
		this.namePhone = namePhone;
		this.price = price;
		this.warranty = warranty;
		this.manufacturer = manufacturer;
	}

	public void input(Scanner sc) throws Exception {

		System.out.print("Nhap ten dien thoai: ");
		namePhone = sc.nextLine();
		if (namePhone.trim().isEmpty()) {
			throw new EmptyFieldException("Ten dien thoai bat buoc nhap");
		}

		System.out.print("Nhap gia: ");
		String priceStr = sc.nextLine();
		if (priceStr.trim().isEmpty()) {
			throw new EmptyFieldException("Gia bat buoc nhap");
		}
		price = Double.parseDouble(priceStr); // NumberFormatException
		if (price < 0) {
			throw new NegativeNumberException("Gia khong duoc am");
		}

		System.out.print("Nhap bao hanh: ");
		warranty = sc.nextLine();
		if (warranty.trim().isEmpty()) {
			throw new EmptyFieldException("Bao hanh bat buoc nhap");
		}

		System.out.print("Nhap hang san xuat: ");
		manufacturer = sc.nextLine();
		if (manufacturer.trim().isEmpty()) {
			throw new EmptyFieldException("Hang san xuat bat buoc nhap");
		}
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNamePhone() {
		return namePhone;
	}

	public void setNamePhone(String namePhone) {
		this.namePhone = namePhone;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void showInfo() {
		System.out.println("ID: " + id + " | " + "Name: " + namePhone + " | " + "Price: " + price + " | " + "Warranty: " + warranty + " | " + "Manufacturer: " + manufacturer);
	}

	public abstract double caculateTotalPrice();

	@Override
	public int compareTo(Phone phone) {
		return Double.compare(this.price, phone.price);
	}
}
