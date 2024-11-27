package lab01;

import java.util.Scanner;

public class Ex63vesao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so hang in ra");
		int rows = sc.nextInt();

		// lap lai so hang da cho
		for (int i = 1; i <= rows; i++) {

			// vong lap de in so khoang cach truoc dau sao
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}

			// in so luong sao moi hang
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// xuong dong sau moi hang
			System.out.println();
		}
		sc.close();
	}
}