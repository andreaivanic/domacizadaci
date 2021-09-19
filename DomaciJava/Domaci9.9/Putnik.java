package domaci;

public class Putnik extends Covek {
	private int novac;

	public Putnik(String imePrezime, int novac) {
		super(imePrezime);
		this.novac = novac;
	}

	public void dodavanjeNovca(int a) {
		novac = novac + a;
	}

	public void oduzimanjeNovca(int b) {
		novac = novac - b;
	}

	public int getNovac() {
		return novac;
	}

	@Override
	public String toString() {
		return "Putnik " + super.getImePrezime() + " poseduje " + novac + "dinara.";
	}
}