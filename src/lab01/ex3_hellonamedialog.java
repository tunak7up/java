package lab01;

import javax.swing.JOptionPane;

public class Ex3_hellonamedialog {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Nguyen Anh Tuan 5772 - Nhap ten vao day"); // hien 1 o de input, o do chua
																							// dong chu trong nhay kep,
																							// ket qua input luu vao
																							// result
		JOptionPane.showMessageDialog(null, "Toi la Nguyen Anh Tuan 5772. Hi " + result + "!"); // in dong chu kem ket
																								// qua
		System.exit(0);
	}
}
