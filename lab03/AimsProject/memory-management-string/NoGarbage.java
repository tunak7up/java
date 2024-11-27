package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {
		String filename = "test.exe"; // Tên file cần đọc (thay bằng file thật)
		byte[] inputBytes = null;
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename)); // Đọc toàn bộ file
		} catch (IOException e) {
			e.printStackTrace();
		}

		long startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for (byte b : inputBytes) {
			outputStringBuilder.append((char) b); // Sử dụng StringBuilder thay vì "+"
		}
		String outputString = outputStringBuilder.toString(); // Chuyển về String
		long endTime = System.currentTimeMillis();
		System.out.println("Time with StringBuilder: " + (endTime - startTime) + " ms");
	}
}
