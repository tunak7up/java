package lab03;

import java.util.ArrayList;

public class Store {
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
}
