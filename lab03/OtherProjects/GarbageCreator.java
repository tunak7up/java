package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) {
		String filename = "test.exe"; // Tên file cần đọc (thay bằng file thật)
		byte[] inputBytes = null;
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename)); // Đọc toàn bộ file
		} catch (IOException e) {
			e.printStackTrace();
		}

		long startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b : inputBytes) {
			outputString += (char) b; // Nối từng byte vào chuỗi
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time with + operator: " + (endTime - startTime) + " ms");
	}
}
