package ss1_oop_overview.coordinate;

import java.util.Scanner;

public class Point {
	double x;
	double y;

	void input(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x: ");
		x = sc.nextDouble();
		System.out.println("Enter y: ");
		y = sc.nextDouble();

	}

	double distanceTo(Point p){
		double dx = x - p.x;
		double dy = y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	void output(){
		System.out.println("(" + x + "," + y +")");
	}
}
