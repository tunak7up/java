package lab03;

public class cartest {
	public static void main(String[] args) {
		Cart don = new Cart();
		Dvd dia1 = new Dvd("nguyen", "anh", "tuan", 1, 2);
		don.addDvd(dia1);
		Dvd dia2 = new Dvd("nguyen", "anh", "tuan", 1, 2);
		don.addDvd(dia2);
		Dvd dia3 = new Dvd("nguyen", "anh", "tuan", 1, 2);
		don.addDvd(dia3);
		don.getList();
		don.searchbyID(1);
		don.searchbyTitle("nguyen");
		if (dia1.isMatch("nguyen1")) {
			System.out.println("ismatch");
		} else
			System.out.println("not match");
	}
}
