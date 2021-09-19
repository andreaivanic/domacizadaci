package domaci;

public class Covek {
	private String imePrezime;

	public Covek(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	@Override
	public String toString() {
		return "Ime i prezime: " + imePrezime;
	}
}
