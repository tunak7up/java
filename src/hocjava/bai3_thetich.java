package hocjava;

import java.util.Scanner;

public class bai3_thetich {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh: ");
		double canh = scanner.nextDouble();
		System.out.println("the tich = " + Math.pow(canh, 3));
		scanner.close();
	}
}
