package ss11_file.phone.util;

import ss11_file.phone.validation.Phone;

import java.util.List;
import java.io.*;

public class WriteFileUtil {
	public static void writeFile(String path, String data) throws IOException {
		File file = new File(path);
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		bufferedWriter.write(data);
		bufferedWriter.close();

	}

	public static void writePhonesFile(String path, List<Phone> phones) throws IOException {
		StringBuilder data = new StringBuilder("ID,Phone Name,Price,Warranty," + "Manufacturer,Battery Status(%),Description,Quantity");
		for (Phone phone : phones) {
			data.append("\n").append(phone.toString());
		}
		writeFile(path, data.toString());
	}
}
