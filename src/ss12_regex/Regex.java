package ss12_regex;

import java.util.Scanner;

public class Regex {
	public static void main(String[] args) {

		System.out.println("(+84)343456789".matches("^(0|[(][+]84[)])3[2-9][0-9]{7}"));

		System.out.println("quangtruong2717@gmail.com".matches("[A-Za-z0-9_]{6,32}@[A-Za-z0-9]{2,12}[.][A-Za-z0-9]{2,12}"));

		System.out.println("quangtruong2717@gmail.com".matches("\\w{6,32}@[A-Za-z\\d]{2,12}[.][A-Za-z\\d]{2,12}"));

		System.out.println("quangtruong27_9".matches("[\\w.]{6,32}"));

		System.out.println("Quangtruong27_9@".matches("[A-Z][^ ]{6,32}"));
	}
}
