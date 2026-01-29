package ss9_set_map.phone;

import java.util.Scanner;

public class OldPhone extends Phone implements Discount {

	private int batteryStatus;
	private String description;

	@Override
	public void input(Scanner sc){
		super.input(sc);

		System.out.print("Nhap tinh trang pin: ");
		batteryStatus = sc.nextInt();
		sc.nextLine();

		System.out.print("Nhap mo ta: ");
		description = sc.nextLine();
	}

	public OldPhone() {
	}

	public OldPhone(String id, String namePhone, double price, String warranty, String manufacturer, int batteryStatus, String description) {
		super(id, namePhone, price, warranty, manufacturer);
		this.batteryStatus = batteryStatus;
		this.description = description;
	}

	public int getBatteryStatus() {
		return batteryStatus;
	}

	public void setBatteryStatus(int batteryStatus) {
		this.batteryStatus = batteryStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(" | Battery: " + batteryStatus + "% | Desc: " + description);
	}

	@Override
	public double caculateTotalPrice() {
		return this.getPrice();
	}

	@Override
	public void applyDiscount(double percent){
		double newPrice = this.getPrice() * (1 - percent / 100);
		this.setPrice(newPrice);
	}
}
