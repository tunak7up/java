package lab01;

import javax.swing.JOptionPane;

public class Ex61ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
				"tuan 20225772-	Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null,
				"tuan 20225772-You've chosen:" + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
		System.exit(0);
	}
}