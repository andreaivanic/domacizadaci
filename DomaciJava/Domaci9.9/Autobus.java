package domaci;

import java.util.ArrayList;
import java.util.List;

public class Autobus {
	private String naziv;
	private Vozac vozac1;
	private int cenaKarte;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, Vozac vozac1, int cenaKarte) {
		this.naziv = naziv;
		this.vozac1 = vozac1;
		this.cenaKarte = cenaKarte;
		this.putnici = new ArrayList<Putnik>();
	}

	public String getNaziv() {
		return naziv;
	}

	public int getCenaKarte() {
		return cenaKarte;
	}

	public Putnik dodavanjePutnika(String imePrezime, int novac) {
		Putnik putnik1 = new Putnik(imePrezime, novac);
		putnici.add(putnik1);
		return putnik1;
	}

	public Putnik oduzimanjePutnika(String imePrezime, int novac) {
		Putnik putnik1 = new Putnik(imePrezime, novac);
		putnici.remove(putnik1);
		return putnik1;
	}

}
