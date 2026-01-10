package ss6_abstract_interface.phone_manager;

import java.util.Scanner;

public abstract class Phone {
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

	public void input(Scanner sc){
		System.out.print("Nhap ten dien thoai: ");
		namePhone = sc.nextLine();

		System.out.print("Nhap gia: ");
		price = sc.nextDouble();
		sc.nextLine();

		System.out.print("Nhap bao hanh: ");
		warranty = sc.nextLine();

		System.out.print("Nhap hang san xuat: ");
		manufacturer = sc.nextLine();
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
}
