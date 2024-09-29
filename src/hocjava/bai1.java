package hocjava;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ten = scanner.nextLine();
		int diem = scanner.nextInt();
		System.out.println(ten + " co diem " + diem);
		scanner.close();
	}
}
