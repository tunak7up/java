package lab01;

// Example 5: ShowTwoNumbers.java
import javax.swing.JOptionPane;

public class Ex4_show2number {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "nguyen anh tuan 5772 You've just entered: ";

		strNum1 = JOptionPane.showInputDialog(null, "Nguyen anh tuan 5772 Nhap so dau tien ", "day la hop nhap 1",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";

		strNum2 = JOptionPane.showInputDialog(null, "Nguyen anh tuan 5772 nhap so thu 2 ", "day la hop nhap 2",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;

		JOptionPane.showMessageDialog(null, strNotification, "day la hop ket qua", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
