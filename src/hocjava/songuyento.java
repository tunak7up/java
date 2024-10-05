package hocjava;

import java.util.Scanner;

public class songuyento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x == 2) {
			System.out.println("so nguyen to");
		} else if (x == 3) {
			System.out.println("so nguyen to");
		} else if (x > 3) {
			int cnt = 0;
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if (x % i == 0) {
					System.out.println("Khong phai so nguyen to");
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("So nguyen to");
			}
		} else
			System.out.println("khong phai so nguyen to");
		sc.close();
	}
}
