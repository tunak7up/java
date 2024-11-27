package lab03;

public class Dvd {
	// attribute
	private String title;
	private String theloai;
	private String tacgia;
	private int dodai;
	private float gia;
	private static int nbDvd = 0;
	private int id;

	// ham tao
	public Dvd() {

	}

	public Dvd(String title, String theloai, String tacgia, int dodai, float gia) {
		super();
		this.title = title;
		this.theloai = theloai;
		this.tacgia = tacgia;
		this.dodai = dodai;
		this.gia = gia;
		nbDvd++;
		this.id = nbDvd;
	}
	// getter and setter

	public String getTitle() {
		return title;
	}

	public int getNbDvd() {
		return this.id;
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

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public void setDodai(int dodai) {
		this.dodai = dodai;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public boolean isMatch(String s) {
		if (this.title.equals(s)) {
			return true;
		} else
			return false;
	}
}
