package lab01;

import javax.swing.JOptionPane;

public class Ex66addmatrix {
	public static void main(String[] args) {
		String m0 = JOptionPane.showInputDialog(null, "Nhap so hang");
		int m = (int) Double.parseDouble(m0);
		String n0 = JOptionPane.showInputDialog(null, "Nhap so cot");
		int n = (int) Double.parseDouble(n0);
		int k = m * n; // k la kich thuoc ma tran
		double[] mang1 = new double[k];
		double[] mang2 = new double[k];
		// nhap mang 1
		for (int i = 0; i < k; i++) {
			String mi0 = JOptionPane.showInputDialog(null, "Nhap cac phan tu cua matrix 1");
			mang1[i] = Double.parseDouble(mi0);
		}
		// hien thi mang 1
		System.out.println("Mang 1:");
		int vt = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mang1[vt] + " ");
				++vt;
			}
			System.out.println();
		}
		// nhap mang 2
		for (int i = 0; i < k; i++) {
			String mi0 = JOptionPane.showInputDialog(null, "Nhap cac phan tu cua matrix 2");
			mang2[i] = Double.parseDouble(mi0);
		}
		// hien thi mang 2
		System.out.println("Mang 2");
		vt = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mang2[vt] + " ");
				++vt;
			}
			System.out.println();
		}
		// cong 2 mang
		for (int i = 0; i < k; i++) {
			mang1[i] += mang2[i];
		}
		// hien thi ket qua
		System.out.println("Ket qua:");
		vt = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mang1[vt] + " ");
				++vt;
			}
			System.out.println();
		}
	}
}
