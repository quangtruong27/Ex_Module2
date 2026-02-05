package check_module2.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static String dateToString(Date date) {
		// Nếu không có ngày (null) thì trả về "null"
		if (date == null) {
			return "null";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = sdf.format(date);
		return strDate;
	}
	private static final SimpleDateFormat DATE_FORMAT =
			new SimpleDateFormat("dd/MM/yyyy");

	public static Date parseDate(String s) {
		try {
			if (s == null || s.trim().isEmpty() || s.equalsIgnoreCase("null")) {
				return null;
			}
			return DATE_FORMAT.parse(s.trim());
		} catch (Exception e) {
			return null;
		}
	}

}