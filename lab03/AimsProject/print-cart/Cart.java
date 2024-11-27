package lab03;

import java.util.ArrayList;

public class Cart {
	public static final int sotoida = 20;
	private ArrayList<Dvd> dsdat = new ArrayList<>();
	public int i = 0;

	public void addDvd(Dvd dia) {
		if (i < sotoida) {
			dsdat.add(dia);
			i++;
			System.out.println("Dia " + i + " da duoc them");
		} else {
			System.out.println("cart da day");
		}
	}

	public void addDvd(Dvd[] ar) {
		if (i + ar.length <= sotoida) {
			for (int j = 0; j < ar.length; j++) {
				dsdat.add(ar[j]);
				i++;
				System.out.println("Dia " + i + " da duoc them");
			}
		} else {
			System.out.println("so dinh them lon hon so dvd hien co");
		}
	}

	public void addDvd(Dvd dia1, Dvd dia2) {
		if (i + 2 <= sotoida) {
			dsdat.add(dia1);
			i++;
			System.out.println("Dia " + i + " da duoc them");
			dsdat.add(dia2);
			i++;
			System.out.println("Dia " + i + " da duoc them");
		} else {
			System.out.println("cart da day");
		}
	}

	public void removeDvd(int x) {
		x--;
		dsdat.remove(x);
		x++;
		System.out.println("Da xoa thanh cong dia " + x);
	}

	public void getList() {
		for (Dvd x : dsdat) {
			System.out.println(x.getNbDvd() + ". " + x.getTitle() + " " + x.getTheloai() + " " + x.getTacgia() + " "
					+ x.getDodai() + " " + x.getGia());
		}
	}

	public void searchbyID(int x) {
		int cnt = i;
		cnt--;
		int check = 0;
		for (int j = 0; j < cnt; j++) {
			if (dsdat.get(j).getNbDvd() == x) {
				System.out.println("Co dia " + x + " la:");
				System.out.println(dsdat.get(j).getNbDvd() + ". " + dsdat.get(j).getTitle() + " "
						+ dsdat.get(j).getTheloai() + " " + dsdat.get(j).getTacgia() + " " + dsdat.get(j).getDodai()
						+ " " + dsdat.get(j).getGia());
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println("Khong tim thay");
		}
	}

	public void searchbyTitle(String s) {
		int cnt = i;
		cnt--;
		int check = 0;
		for (int j = 0; j < cnt; j++) {
			if (dsdat.get(j).getTitle().equals(s)) {
				System.out.println("co dia trung title vua nhap");
				System.out.println(dsdat.get(j).getNbDvd() + ". " + dsdat.get(j).getTitle() + " "
						+ dsdat.get(j).getTheloai() + " " + dsdat.get(j).getTacgia() + " " + dsdat.get(j).getDodai()
						+ " " + dsdat.get(j).getGia());
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println("Khong tim thay");
		}
	}

	public float getTotalCost() {
		float tong = 0;
		for (Dvd x : dsdat) {
			tong += x.getGia();
		}
		return tong;
	}
}
