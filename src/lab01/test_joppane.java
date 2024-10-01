package lab01;

import javax.swing.JOptionPane;

public class test_joppane {
	public static void main(String[] args) {
		// Nhập hai số từ người dùng
		String strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:");
		String strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:");

		// Chuyển từ chuỗi sang kiểu double
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);

		// Tính tổng, hiệu, tích
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;

		// Kiểm tra số chia
		String result;
		if (num2 != 0) {
			double quotient = num1 / num2;
			result = "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: "
					+ quotient;
		} else {
			result = "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product
					+ "\nError: Cannot divide by zero!";
		}

		// Hiển thị kết quả
		JOptionPane.showMessageDialog(null, result, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
