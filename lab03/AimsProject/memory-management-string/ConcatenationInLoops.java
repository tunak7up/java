package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {
	public static void main(String[] args) {
		// Phương pháp 1: Sử dụng toán tử "+" để nối chuỗi
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 65536; i++) {
			s += r.nextInt(2); // Mỗi lần nối tạo một đối tượng String mới
		}
		System.out.println("Time with + operator: " + (System.currentTimeMillis() - start) + " ms");

		// Phương pháp 2: Sử dụng StringBuilder
		r = new Random(123); // Reset random để tạo kết quả giống nhau
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 65536; i++) {
			sb.append(r.nextInt(2));
		}
		s = sb.toString(); // Kết quả cuối cùng là một chuỗi
		System.out.println("Time with StringBuilder: " + (System.currentTimeMillis() - start) + " ms");
	}
}
