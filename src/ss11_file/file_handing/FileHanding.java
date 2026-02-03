package ss11_file.file_handing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
a. Viết chương trình đọc vào tất cả các dòng của 1 file. Sau đó hiển thị tất cả thông tin đọc được trên cùng 1 dòng.

b. Viết chương trình đọc vào đúng 3 dòng của 1 file. Sau đó hiển thị các dòng đọc được ra màn hình console.

c. Viết chương trình đếm số lần xuất hiện của 1 từ nào đó trong 1 file. Mỗi từ được đặt ở trên 1 dòng của file.

d. Viết chương trình kiểm tra xem 1 đường dẫn đang chỉ đến 1 file hay 1 thư mục.

e. Viết chương trình xóa 1 file hoặc 1 thư mục cho trước.

f. Viết chương trình đổi tên 1 file hoặc 1 thư mục cho trước.
 */
public class FileHanding {
	//a. Viết chương trình đọc vào tất cả các dòng của 1 file. Sau đó hiển thị tất cả thông tin đọc được trên cùng 1 dòng.
	public static void readerAllFile(String path) {

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // Dùng như này ko cần close file
			String line;
			while ((line = br.readLine()) != null) {
				System.out.print(line + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// b. Viết chương trình đọc vào đúng 3 dòng của 1 file. Sau đó hiển thị các dòng đọc được ra màn hình console.
	public static void readThreeLines(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			int count = 0;

			while ((line = br.readLine()) != null && count < 3) {
				System.out.println(line);
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//c. Viết chương trình đếm số lần xuất hiện của 1 từ nào đó trong 1 file. Mỗi từ được đặt ở trên 1 dòng của file.
	public static Map<String, Integer> countWordByMap(String link) {
		Map<String, Integer> map = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(link))) {
			String line;

			while ((line = br.readLine()) != null) {
				if (line.trim().isEmpty()) continue;

				map.put(line, map.getOrDefault(line, 0) + 1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return map;
	}


	//d. Viết chương trình kiểm tra xem 1 đường dẫn đang chỉ đến 1 file hay 1 thư mục.
	public static void checkPath(String path){
		File file = new File(path);

		if(!file.exists()){
			System.out.println("Duong dan khong ton tai");
		} else if (file.isFile()){
			System.out.println("Day la FILE");
		} else if (file.isDirectory()){
			System.out.println("Day la FOLDER");
		}
	}

	//e. Viết chương trình xóa 1 file hoặc 1 thư mục cho trước.
	public static void deleteFile (String path){
		File file = new File(path);
		if (!file.exists()){
			System.out.println("Khong ton tai");
			return;
		}

		if (file.delete()){
			System.out.println("Xoa thanh cong");
		}else{
			System.out.println("Xoa that bai");
		}
	}

	// f. Viết chương trình đổi tên 1 file hoặc 1 thư mục cho trước.
	public static void renameFile(String oldPath, String newPath){
		File oldFile = new File(oldPath);
		File newFile = new File(newPath);
		if (!oldFile.exists()){
			System.out.println("Khong ton tai");
			return;
		}

		if(oldFile.renameTo(newFile)){
			System.out.println("Doi ten File thanh cong");
		}else{
			System.out.println("Doi that bai");
		}
	}
	public static void main(String[] args) {
		String path = "src/ss11_file/file_handing/input.txt";
		String link = "src/ss11_file/file_handing/countword.txt";

		System.out.println("Cau a:");
		readerAllFile(path);

		System.out.println("\nCau b:");
		readThreeLines(path);


		System.out.println("Cau c:");
		Map<String, Integer> wordMap = countWordByMap(link);

		for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("Cau d:");
		checkPath(path);

		System.out.println("Cau e:");
		deleteFile(path);

		System.out.println("Cau f:");
		renameFile("src/ss11_file/file_handing/countword.txt", "src/ss11_file/file_handing/countword2.txt");
	}
}
