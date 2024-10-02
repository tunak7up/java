//Nguyen Anh Tuan 20225772 bai 2.6
package lab01;

import javax.swing.JOptionPane;

public class Ex60_giaiphuongtrinh {
	public static void main(String[] args) {
		System.out.println("Chon che do:");
		System.out.println("1. Giai phuong trinh bac nhat 1 an"); // ax + b = c;
		System.out.println("2. Giai phuong trinh bac nhat 2 an");
		System.out.println("3. Giai phuong trinh bac hai 1 an");
		int lua = 1;
		while (lua == 1 || lua == 2 || lua == 3) {
			String op = JOptionPane.showInputDialog(null, "Chọn option:", "Hộp lựa chọn",
					JOptionPane.INFORMATION_MESSAGE);
			lua = (int) Double.parseDouble(op);
			if (lua == 1) {
				String a0 = JOptionPane.showInputDialog(null, "Nhap a", " ax + b = c", JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(a0);
				if (a == 0) {
					JOptionPane.showMessageDialog(null, "Vui long chon a != 0");
					continue;
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
				String a021 = JOptionPane.showInputDialog(null, "Nhap a21", "a21x1 + a22x2 = b2",
						JOptionPane.INFORMATION_MESSAGE);
				String a022 = JOptionPane.showInputDialog(null, "Nhap a22", "a21x1 + a22x2 = b2",
						JOptionPane.INFORMATION_MESSAGE);
				String b02 = JOptionPane.showInputDialog(null, "Nhap b02", "a21x1 + a22x2 = b2",
						JOptionPane.INFORMATION_MESSAGE);
				double a11 = Double.parseDouble(a011);
				double a12 = Double.parseDouble(a012);
				double b1 = Double.parseDouble(b01);
				double a21 = Double.parseDouble(a021);
				double a22 = Double.parseDouble(a022);
				double b2 = Double.parseDouble(b02);
				double d = a11 * a22 - a21 * a12;
				double d1 = b1 * a22 - b2 * a12;
				double d2 = a11 * b2 - a21 * b1;
				if (d != 0) {
					JOptionPane.showMessageDialog(null, "He co nghiem duy nhat x1 =" + d1 / d + " va x2 = " + d2 / d);
				} else if (d == 0 && (d1 != 0 || d2 != 0)) {
					JOptionPane.showMessageDialog(null, "He vo nghiem");
				} else if (d == 0 && d1 == 0 && d2 == 0) {
					JOptionPane.showMessageDialog(null, "He vo so nghiem");
				}
			} else if (lua == 3) {
				String a0 = JOptionPane.showInputDialog(null, "Nhap a", "ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(a0);
				if (a == 0) {
					JOptionPane.showMessageDialog(null, "Vui long nhap a != 0");
					continue;
				}
				String b0 = JOptionPane.showInputDialog(null, "Nhap b", "ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE);
				String c0 = JOptionPane.showInputDialog(null, "Nhap c", "ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE);
				double b = Double.parseDouble(b0);
				double c = Double.parseDouble(c0);
				double delta = b * b - 4 * a * c;
				if (delta > 0) {
					double x1 = (-b + Math.sqrt(delta)) / (2 * a);
					double x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.println(Math.sqrt(delta));
					JOptionPane.showMessageDialog(null, "2 nghiem x1 = " + x1 + " va x2 = " + x2);
				} else if (delta == 0) {
					double x1 = -b / (2 * a);
					JOptionPane.showMessageDialog(null, "Nghiem duy nhat x = " + x1);
				} else {
					JOptionPane.showMessageDialog(null, "Chi co nghiem phuc");
				}
			}

		}
	}
}
