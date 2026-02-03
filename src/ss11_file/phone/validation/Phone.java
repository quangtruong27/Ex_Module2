package ss11_file.phone.validation;

import ss11_file.phone.exception.EmptyFieldException;
import ss11_file.phone.exception.NegativeNumberException;

import java.util.Scanner;

public abstract class Phone implements Comparable<Phone> {
	private String id;
	private String namePhone;
	private double price;
	private int warranty;
	private String manufacturer;

	public Phone() {
	}

	public Phone(String id, String namePhone, double price, int warranty, String manufacturer) {
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
		String warrantyStr = sc.nextLine();

		if (warrantyStr.trim().isEmpty()) {
			throw new EmptyFieldException("Bao hanh bat buoc nhap");
		}

		warranty = Integer.parseInt(warrantyStr);

		if (warranty < 0) {
			throw new NegativeNumberException("Bao hanh khong duoc am");
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

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
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

	protected String baseToCSV() {
		return id + "," + namePhone + "," + price + "," + warranty + "," + manufacturer;
	}
}
