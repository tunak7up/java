package hocjava;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dai = ");
		double dai = scanner.nextDouble();
		System.out.println("Rong = ");
		double rong = scanner.nextDouble();
		System.out.printf("Chu vi = %.0f", (dai + rong) * 2);
		System.out.printf("\nDien tich = %.0f", dai * rong);
		System.out.printf("\nCanh nho nhat = %.0f", Math.min(dai, rong));
	}
}
