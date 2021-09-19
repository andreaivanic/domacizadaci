package domaci;

public class Vozac extends Covek {
	private String zvanje;

	public Vozac(String imePrezime, String zvanje) {
		super(imePrezime);
		this.zvanje=zvanje;
	}
	
	@Override
	public String toString() {
		return "Zvanje: "+ zvanje+ " -Ime i prezime: " + super.getImePrezime();
	}
	
}
