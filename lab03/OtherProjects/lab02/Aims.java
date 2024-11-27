package lab02;

import java.util.Scanner;

public class Aims {
	public static void main(String[] args) {
		Cart don = new Cart();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Chon che do:");
			System.out.println("1. Them vao gio hang");
			System.out.println("2. Xoa khoi gioi hang");
			System.out.println("3. In ra danh sach dvd");
			System.out.println("4. Tong gia");
			System.out.println("5. Ket thuc");
			String op = sc.nextLine();
			if (op.equals("1")) { // them dia vao gio hang
				System.out.println("Nhap tieu de, thu muc, tac gia, do dai, gia tien");
				String tieude = sc.nextLine();
				String thumuc = sc.nextLine();
				String tacgia = sc.nextLine();
				int dodai = sc.nextInt();
				float giatien = sc.nextFloat();
				sc.nextLine();
				Dvd dia = new Dvd(tieude, thumuc, tacgia, dodai, giatien);
				don.addDvd(dia);
			} else if (op.equals("2")) { // xoa dia khoi gio hang
				System.out.println("Chon thu tu cua dvd muon xoa");
				don.getList();
				int xoa = sc.nextInt();
				sc.nextLine();
				don.removeDvd(xoa);
			} else if (op.equals("3")) { // in ra ten va gia cua tat ca cac dvd
				don.getList();
			} else if (op.equals("4")) {
				System.out.println(don.getTotalCost());
			} else
				break;
		}

		sc.close();
	}
}
