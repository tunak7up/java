package lab01;

import javax.swing.JOptionPane;

public class Ex6_giaiphuongtrinh {
	public static void main(String[] args) {
		System.out.println("Chon che do:");
		System.out.println("1. Giai phuong trinh bac nhat 1 an"); // ax + b = c;
		System.out.println("2. Giai phuong trinh bac nhat 2 an");
		System.out.println("3. Giai phuong trinh bac hai 1 an");
		String op = JOptionPane.showInputDialog(null, "Chọn option:", "Hộp lựa chọn", JOptionPane.INFORMATION_MESSAGE);
		int lua = (int) Double.parseDouble(op);
		while (lua == 1 || lua == 2 || lua == 3) {
			if (lua == 1) {
				String a0 = JOptionPane.showInputDialog(null, "Nhap a", " ax + b = c", JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(a0);
				if (a == 0) {
					break;
				}
				String b0 = JOptionPane.showInputDialog(null, "Nhap b", "cho ax + b = c",
						JOptionPane.INFORMATION_MESSAGE);
				String c0 = JOptionPane.showInputDialog(null, "Nhap c", " cho ax + b = c",
						JOptionPane.INFORMATION_MESSAGE);
				double b = Double.parseDouble(b0);
				double c = Double.parseDouble(c0);
				JOptionPane.showMessageDialog(null, "ket qua: " + (c - b) / a);

			} else if (lua == 2) {
				String a011 = JOptionPane.showInputDialog(null, "Nhap a11", "a11x1 + a12x2 = b1",
						JOptionPane.INFORMATION_MESSAGE);
				String a012 = JOptionPane.showInputDialog(null, "Nhap a12", "a11x1 + a12x2 = b1",
						JOptionPane.INFORMATION_MESSAGE);
				String b01 = JOptionPane.showInputDialog(null, "Nhap a11", "a11x1 + a12x2 = b1",
						JOptionPane.INFORMATION_MESSAGE);
			}
			op = JOptionPane.showInputDialog(null, "Chon option:");
			lua = (int) Double.parseDouble(op);
		}
	}
}
