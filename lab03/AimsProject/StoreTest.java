package lab03;

public class StoreTest {
	public static void main(String[] args) {
		Store item = new Store();
		Dvd dia1 = new Dvd("nguyen", "anh", "tuan", 1, 2);
		Dvd dia2 = new Dvd("nguyen", "anh", "tuan", 1, 2);
		Dvd dia3 = new Dvd("nguyen", "anh", "tuan", 1, 2);
		item.addDvd(dia1);
		item.addDvd(dia2);
		item.addDvd(dia3);
		item.getList();
		item.removeDvd(1);
		item.getList();
	}
}
