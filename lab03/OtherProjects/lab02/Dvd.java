package lab02;

public class Dvd {
	private String title;
	private String theloai;
	private String tacgia;
	private int dodai;
	private float gia;

	public String getTitle() {
		return title;
	}

	public String getTheloai() {
		return theloai;
	}

	public String getTacgia() {
		return tacgia;
	}

	public int getDodai() {
		return dodai;
	}

	public float getGia() {
		return gia;
	}

	public Dvd(String title, String theloai, String tacgia, int dodai, float gia) {
		super();
		this.title = title;
		this.theloai = theloai;
		this.tacgia = tacgia;
		this.dodai = dodai;
		this.gia = gia;
	}

}
