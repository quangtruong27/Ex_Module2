package util;

import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);

	public static int inputPositive(String target, int number) {

		int n;
		do{
			System.out.print("Nhap n: ");
			n = sc.nextInt();

			if( n < number){
				System.out.println("nhap lai");
			}
		}
		while(n < number);
		return n;
	}
}
