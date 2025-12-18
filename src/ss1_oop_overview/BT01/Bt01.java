package ss1_oop_overview.BT01;

import java.util.Scanner;

public class Bt01 {
	String name;
	double mathScore;
	double literatureScore;

	void input(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ten: ");
		name = sc.nextLine();

		System.out.println("Nhap diem toan: ");
		mathScore = Double.parseDouble(sc.nextLine());

		System.out.println("Nhap diem van: ");
		literatureScore = Double.parseDouble(sc.nextLine());
	}

	double calculateAverageScore(){
		return (mathScore + literatureScore) / 2;
	}
	void output(){
		System.out.println("Ten: " + name);
		System.out.println("Diem toan: " + mathScore);
		System.out.println("Diem van: " + literatureScore);
		System.out.println("Diem trung binh: " + calculateAverageScore());
	}


}
