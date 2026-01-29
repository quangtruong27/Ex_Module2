package ss9_set_map.phone;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static PhoneService phoneService = new PhoneService();

	public static void main(String[] args) {
		int choice = 0;

		do {
			System.out.println("\n*** CHUONG TRINH QUAN LY DIEN THOAI ***");
			System.out.println("1. Xem danh sach dien thoai");
			System.out.println("2. Them moi");
			System.out.println("3. Cap nhat");
			System.out.println("4. Xoa");
			System.out.println("5. Sap xep theo gia");
			System.out.println("6. Tim kiem");
			System.out.println("7. Tinh tong tien");
			System.out.println("8. Giam gia cho dien thoai cu");
			System.out.println("9. Thoat");
			System.out.print("Moi ban nhap (1-9): ");

			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
				case 1:
					viewList();
					break;
				case 2:
					addNew();
					break;
				case 3:
					phoneService.updatePhone();
					break;
				case 4:
					phoneService.deletePhone();
					break;
				case 5:
					arrange();
					break;
				case 6:
					search();
					break;
				case 7:
					phoneService.totalMoney();
					break;
				case 8:
					System.out.print("Nhap % giam gia: ");
					double percent = Double.parseDouble(sc.nextLine());
					phoneService.discountOldPhone(percent);
					break;
				case 9:
					System.out.println("Thoat chuong trinh.");
					System.exit(0);
				default:
					System.out.println("Lua chon khong hop le");
			}
		} while (true);
	}

	public static void viewList() {
		int subChoice = 0;
		do {
			System.out.println("\n*** XEM DANH SACH DIEN THOAI ***");
			System.out.println("1. Xem tat ca");
			System.out.println("2. Xem dien thoai cu");
			System.out.println("3. Xem dien thoai moi");
			System.out.println("4. Tro ve menu chinh");
			System.out.print("Chon: ");

			subChoice = Integer.parseInt(sc.nextLine());

			switch (subChoice) {
				case 1:
					phoneService.displayPhone();
					break;
				case 2:
					phoneService.displayOld();
					break;
				case 3:
					phoneService.displayNew();
					break;
				case 4:
					return;
				default:
					System.out.println("Lua chon khong hop le");
			}
		} while (true);
	}

	public static void addNew() {
		int subChoice = 0;
		do {
			System.out.println("\n*** THEM MOI ***");
			System.out.println("1. Them moi dien thoai cu");
			System.out.println("2. Them moi dien thoai moi");
			System.out.println("3. Tro ve menu chinh");
			System.out.print("Chon: ");

			subChoice = Integer.parseInt(sc.nextLine());

			switch (subChoice) {
				case 1:
					phoneService.addPhone(false);
					break;
				case 2:
					phoneService.addPhone(true);
					break;
				case 3:
					return;
				default:
					System.out.println("Lua chon khong hop le");
			}
		} while (true);
	}

	public static void arrange() {
		int subChoice = 0;
		do {
			System.out.println("\n*** SAP XEP ***");
			System.out.println("1. Tang dan");
			System.out.println("2. Giam dan");
			System.out.println("3. Tro ve menu chinh");
			System.out.print("Chon: ");

			subChoice = Integer.parseInt(sc.nextLine());

			switch (subChoice) {
				case 1:
					phoneService.sortByPrice(true);
					break;
				case 2:
					phoneService.sortByPrice(false);
					break;
				case 3:
					return;
				default:
					System.out.println("Lua chon khong hop le");
			}
		} while (true);
	}

	public static void search() {
		int choice;
		do {
			System.out.println("\n=== MENU TIM KIEM ===");
			System.out.println("1. Tim kiem tat ca dien thoai");
			System.out.println("2. Tim kiem dien thoai cu");
			System.out.println("3. Tim kiem dien thoai moi");
			System.out.println("4. Tro ve menu chinh");
			System.out.print("Chon: ");

			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
				case 1:
					searchSubMenu(1);
					break;
				case 2:
					searchSubMenu(2);
					break;
				case 3:
					searchSubMenu(3);
					break;
				case 4:
					return;
				default:
					System.out.println("Lua chon khong hop le");
			}
		} while (true);
	}

	public static void searchSubMenu(int type) {
		int subChoice;
		do {
			System.out.println("\n--- LUA CHON TIM KIEM ---");
			System.out.println("1. Tim theo gia");
			System.out.println("2. Tim theo ten");
			System.out.println("3. Tim theo hang");
			System.out.println("4. Tro ve menu Tim kiem");
			System.out.print("Chon: ");

			subChoice = Integer.parseInt(sc.nextLine());

			switch (subChoice) {
				case 1:
					System.out.print("Nhap gia min: ");
					double min = Double.parseDouble(sc.nextLine());
					System.out.print("Nhap gia max: ");
					double max = Double.parseDouble(sc.nextLine());
					phoneService.searchByPriceType(type, min, max);
					break;

				case 2:
					System.out.print("Nhap ten can tim: ");
					String name = sc.nextLine();
					phoneService.searchByNameType(type, name);
					break;

				case 3:
					System.out.print("Nhap hang san xuat: ");
					String manu = sc.nextLine();
					phoneService.searchByManufacturerType(type, manu);
					break;

				case 4:
					return;

				default:
					System.out.println("Lua chon khong hop le");
			}
		} while (true);
	}
}