package ss4_ke_thua;

public class PhoneOld extends Phone {

	private int batteryStatus;
	private String description;

	public PhoneOld() {
	}

	public PhoneOld(String id, String namePhone, double price, String warranty, String manufacturer, int batteryStatus, String description) {
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
		System.out.println("ID: " + getId() + " | " + "Name: " + getNamePhone() + " | " + "Price: " + getPrice() + " | " + "Warranty: " + getWarranty() + " | " + "Manufacturer: " + getManufacturer() + " | " + "Battery Status: " + batteryStatus + " | " + "Description: " + description);
	}
}
