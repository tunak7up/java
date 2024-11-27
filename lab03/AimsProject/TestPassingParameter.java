package lab03;

public class TestPassingParameter {
	public static void main(String[] args) {
		// String title, String theloai, String tacgia, int dodai, float gia
		Dvd tuan1 = new Dvd("Abe", "Old Tale", "Cosmograph", 24, 6996);
		Dvd tuan2 = new Dvd("Cinderella", "Failed Tale", "Cosmograph", 25, 7000);
		swap(tuan1, tuan2);
		System.out.println("title cua tuan1: " + tuan1.getTitle());
		System.out.println("title cua tuan2: " + tuan2.getTitle());

		changeTitle(tuan1, "Grave");
		System.out.println("title moi cua tuan1: " + tuan1.getTitle());
	}

	public static void swap(Dvd tuan1, Dvd tuan2) {
		Dvd tmp = new Dvd(tuan1.getTitle(), tuan1.getTheloai(), tuan1.getTacgia(), tuan1.getDodai(), tuan1.getGia());
		tuan1.setDodai(tuan2.getDodai());
		tuan1.setGia(tuan2.getGia());
		tuan1.setTacgia(tuan2.getTacgia());
		tuan1.setTheloai(tuan2.getTheloai());
		tuan1.setTitle(tuan2.getTitle());
		//
		tuan2.setDodai(tmp.getDodai());
		tuan2.setGia(tmp.getGia());
		tuan2.setTacgia(tmp.getTacgia());
		tuan2.setTheloai(tmp.getTheloai());
		tuan2.setTitle(tmp.getTitle());
	}

	public static void changeTitle(Dvd tuan1, String title) {
		tuan1.setTitle(title);
	}
}
