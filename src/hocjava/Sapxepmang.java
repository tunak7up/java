package hocjava;

import java.util.Arrays;
import java.util.Scanner;

public class Sapxepmang {
	public static void main(String[] args) {
		System.out.println("Nhap do dai cua mang can sap xep: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Gia tri nho nhat: " + a[0]);
		System.out.println("Gia tri lon nhat: " + a[a.length - 1]);
		sc.close();
	}
}
