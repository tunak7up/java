package lab01;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex65sx {
	public static void main(String[] args) {
		String n0 = JOptionPane.showInputDialog(null, "Nhap so phan tu cua mang:");
		int n = (int) Double.parseDouble(n0);
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			String ai = JOptionPane.showInputDialog(null, "Nhap a[" + i + "]");
			a[i] = (int) Double.parseDouble(ai);
		}
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
