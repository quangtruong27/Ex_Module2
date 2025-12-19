package ss1_oop_overview.student_manager;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBt01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Input.inputPositive("n", 0);

		ArrayList<Bt01> bt01s = new ArrayList<Bt01>();

		System.out.println("=======NHAP THONG TIN=========");
		for( int i = 1; i <= n; i ++){
			System.out.printf("\n****Nhap thong tin sinh vien thu [%d]\n", i);
			Bt01 bt01 = new Bt01();
			bt01.input();
			bt01s.add(bt01);
		}

		System.out.println("\n======Xuat thong tin=======");
		for(int i =  1; i <= n; i ++){
			System.out.printf("\n***** Thong tin sinh vien thu [%d]\n", i);
			bt01s.get(i - 1).output();
		}


	}
}
