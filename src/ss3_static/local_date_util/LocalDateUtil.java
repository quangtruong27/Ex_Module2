package ss3_static.local_date_util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {

	// fromString_ddMMyyyy(String date): Chuyển đổi chuỗi với định dạng dd/MM/yyyy sang LocalDate.
	public static LocalDate fromString_ddMMyyyy(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(date, formatter);
	}

	// fromString_yyyyMMdd(String date): Chuyển đổi chuỗi với định dạng yyyy/MM/dd sang LocalDate.
	public static LocalDate fromString_yyyyMMdd(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		return LocalDate.parse(date, formatter);
	}

	// toString_ddMMyyyy(LocalDate date): Chuyển đổi LocalDate sang chuỗi với định dạng dd/MM/yyyy.
	public static String toString_ddMMyyyy(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return date.format(formatter);
	}

	// toString_yyyyMMdd(LocalDate date): Chuyển đổi LocalDate sang chuỗi với định dạng yyyy/MM/dd.
	public static String toString_yyyyMMdd(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		return date.format(formatter);
	}
}