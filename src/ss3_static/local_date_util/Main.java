package ss3_static.local_date_util;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		String s1 = "25/12/2023";
		LocalDate d1 = LocalDateUtil.fromString_ddMMyyyy(s1);
		System.out.println("Ngay sau khi chuyen: " + d1);

		LocalDate homNay = LocalDate.now();
		String s2 = LocalDateUtil.toString_ddMMyyyy(homNay);
		System.out.println("Chuoi sau khi format: " + s2);
	}
}
