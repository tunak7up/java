package hocjava;

import javax.swing.JOptionPane;

public class caudieukien {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		String chuoi = JOptionPane.showInputDialog(null, "Lựa chọn của bạn là : ");
		int chuoi1 = (int) Double.parseDouble(chuoi);
		switch (chuoi1) {
		case 1:
			System.out.println("cong");
			break;
		case 2:
			System.out.println("tru");
			break;
		default:
			System.out.println("out");
			System.exit(0);
		}
//		System.out.println("Lựa chọn của bạn là : ");
	}
}
