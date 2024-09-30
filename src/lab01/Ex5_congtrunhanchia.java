package lab01;

import javax.swing.JOptionPane;

public class Ex5_congtrunhanchia {
	public static void main(String[] args) {
		// Nhập số bị chia và số chia từ bàn phím, lưu vào sbc và sc
		String sbc1 = JOptionPane.showInputDialog(null, "Nhap so bi chia");
		String sc1 = JOptionPane.showInputDialog(null, "Nhap so chia");
		// chuyển 2 sâu vừa nhập sang số dạng double
		double sbc = Double.parseDouble(sbc1);
		double sc = Double.parseDouble(sc1);
		// tính tổng, hiệu và tích
		double tong = sbc + sc;
		double hieu = sbc - sc;
		double tich = sbc * sc;

		String kq;
		// check xem số chia có khác 0 hay không
		if (sc != 0) {
			double thuong = sbc / sc;
			kq = "Tong: " + tong + "\nHieu: " + hieu + "\nTich: " + tich + "\nThuong: " + thuong;
		} else {
			kq = "Tong: " + tong + "\nHieu: " + hieu + "\nTich: " + tich + "\nso chia = 0";
		}
		// hien ket qua
		JOptionPane.showMessageDialog(null, kq);
		System.exit(0);
	}
}
