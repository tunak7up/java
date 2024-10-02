package lab01;

import javax.swing.JOptionPane;

public class Ex64nam {
	public static void main(String[] args) {
		String nam0 = JOptionPane.showInputDialog(null, "Nhap nam");
		double nam = 0;
		if (nam0.matches("\\d+")) {
			nam = Double.parseDouble(nam0);
		}
		String thang0 = JOptionPane.showInputDialog(null, "Nhap thang");
		double thang = 0;
		if (thang0.matches("\\d+")) {
			thang = Double.parseDouble(thang0);
		}
		if (thang == 1 || thang0.equals("Jan") || thang == 3 || thang0.equals("Mar") || thang == 5
				|| thang0.equals("May") || thang == 7 || thang0.equals("Jul") || thang == 8 || thang0.equals("Aug")
				|| thang == 10 || thang0.equals("Oct") || thang == 12 || thang0.equals("Dec")) {
			JOptionPane.showMessageDialog(null, "Thang " + thang0 + " co 31 ngay");
		} else if (thang == 2 || thang0.equals("Feb")) {
			if (nam % 4 == 0) {
				if (nam % 400 == 0) {
					JOptionPane.showMessageDialog(null, "Nam nhuan: thang 2 co 29 ngay");
				} else if (nam % 100 == 0) {
					JOptionPane.showMessageDialog(null, "Nam ko nhuan: thang 2 co 28 ngay");
				} else
					JOptionPane.showMessageDialog(null, "Nam nhuan: thang 2 co 29 ngay");
			} else
				JOptionPane.showMessageDialog(null, "Nam ko nhuan: thang 2 co 28 ngay");

		} else
			JOptionPane.showMessageDialog(null, "Thang" + thang0 + " co 30 ngay");
	}
}
