package lab03;

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
			System.out.println("5. SearchById");
			System.out.println("6. SearchByTitle");
			System.out.println("10. Ket thuc");
			String op = sc.nextLine();
			String kieuthem;
			if (op.equals("1")) { // them dia vao gio hang
				// chon kieu them
				System.out.println("1. Tham so la dvd");
				System.out.println("2. Tham so la 1 array list");
				System.out.println("3. Tham so la 2 dvd");
				kieuthem = sc.nextLine();
				// kieu them 1 dvd vao gio hang
				if (kieuthem.equals("1")) {
					System.out.println("Nhap tieu de, thu muc, tac gia, do dai, gia tien");
					String tieude = sc.nextLine();
					String thumuc = sc.nextLine();
					String tacgia = sc.nextLine();
					int dodai = sc.nextInt();
					float giatien = sc.nextFloat();
					sc.nextLine();
					Dvd dia = new Dvd(tieude, thumuc, tacgia, dodai, giatien);
					don.addDvd(dia);
					// kieu them array dvd vao gio hang
				} else if (kieuthem.equals("2")) {
					System.out.println("Nhap so dvd trong array list: ");
					int sodvdtrongar = sc.nextInt();
					sc.nextLine();
					Dvd[] ar = new Dvd[sodvdtrongar];
					// nhap dvd vao array
					for (int i = 0; i < sodvdtrongar; i++) {
						System.out.println("Nhap tieu de, thu muc, tac gia, do dai, gia tien");
						String tieude = sc.nextLine();
						String thumuc = sc.nextLine();
						String tacgia = sc.nextLine();
						int dodai = sc.nextInt();
						float giatien = sc.nextFloat();
						sc.nextLine();
						Dvd dia = new Dvd(tieude, thumuc, tacgia, dodai, giatien);
						ar[i] = dia;
					}
					// nhap array vao lam method overloading
					don.addDvd(ar);

				} // nhap 2 dvd cung luc
				else if (kieuthem.equals("3")) {
					// nhap thong tin dia 1
					System.out.println("Nhap tieu de, thu muc, tac gia, do dai, gia tien");
					String tieude = sc.nextLine();
					String thumuc = sc.nextLine();
					String tacgia = sc.nextLine();
					int dodai = sc.nextInt();
					float giatien = sc.nextFloat();
					sc.nextLine();
					Dvd dia1 = new Dvd(tieude, thumuc, tacgia, dodai, giatien);
					// nhap thong tin dia 2
					System.out.println("Nhap tieu de, thu muc, tac gia, do dai, gia tien");
					tieude = sc.nextLine();
					thumuc = sc.nextLine();
					tacgia = sc.nextLine();
					dodai = sc.nextInt();
					giatien = sc.nextFloat();
					sc.nextLine();
					Dvd dia2 = new Dvd(tieude, thumuc, tacgia, dodai, giatien);
					don.addDvd(dia1, dia2);

				}
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
			} else if (op.equals("5")) {
				System.out.println("Nhap id cua dia muon tim");
				int search = sc.nextInt();
				sc.nextLine();
				don.searchbyID(search);
			} else if (op.equals("6")) {
				System.out.println("Nhap title cua dia muon tim");
				String search = sc.nextLine();
				don.searchbyTitle(search);
				;
			} else
				break;
		}

		sc.close();
	}
}
