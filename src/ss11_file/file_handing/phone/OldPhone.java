package ss11_file.file_handing.phone;

import ss11_file.file_handing.phone.exception.EmptyFieldException;
import ss11_file.file_handing.phone.exception.MinLengthException;
import ss11_file.file_handing.phone.exception.NumberOutOfRangeException;

import java.util.Scanner;

public class OldPhone extends Phone implements Discount {

	private int batteryStatus;
	private String description;

	@Override
	public void input(Scanner sc) throws Exception {
		super.input(sc);

		System.out.print("Nhap tinh trang pin: ");
		String pinStr = sc.nextLine();
		if (pinStr.trim().isEmpty()) {
			throw new EmptyFieldException("Tinh trang pin bat buoc nhap");
		}
		batteryStatus = Integer.parseInt(pinStr); // NumberFormatException
		if (batteryStatus < 0 || batteryStatus > 100) {
			throw new NumberOutOfRangeException("Tinh trang pin tu 0-100%");
		}

		System.out.print("Nhap mo ta: ");
		description = sc.nextLine();
		if (description.trim().length() < 10) {
			throw new MinLengthException("Mo ta phai >= 10 ky tu");
		}
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
