package class1;

public class automobil {
	public String marka;
	public String model;
	public String pogon;
	public int brojVrata;
	public int godiste;
	public int potrosnjaGoriva;
	public int kubikaza;
	private int predjeniKm;
	public int cena;

	public automobil(String marka, String model, String pogon, int brojVrata, int godiste, int kubikaza, int cena) {
		this.marka = marka;
		this.model = model;
		this.pogon = pogon;
		this.brojVrata = brojVrata;
		this.godiste = godiste;
		this.kubikaza = kubikaza;
		this.cena = cena;
	}

	public automobil() {
	};

	public void podaci() {
		System.out.println("Marka automobila je " + marka + ", model " + model + ", pogon " + pogon + ", broj vrata"
				+ " " + brojVrata + ", godiste " + godiste + "." + " i presao je " + getPredjeniKm() + "km."
				+ "Ukupna potrosnja goriva na 100km je " + potrosnja() + "litara." + "Ukupno je potroseno "
				+ cenaPotresenog() + " dinara na gorivo.");
	}

	public void setPredjeniKm(int predjeniKm) {
		this.predjeniKm = predjeniKm;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;
	}

	public int potrosnja() {
		if (this.kubikaza > 1000) {
			return this.potrosnjaGoriva = 10;
		} else {
			return this.potrosnjaGoriva = 8;
		}
	}

	public int cenaPotresenog() {
		if (this.kubikaza > 1000) {
			int iznos = this.predjeniKm / 100 * 10 * 120;
			return iznos;
		} else {
			int iznos1 = this.predjeniKm / 100 * 8 * 120;
			return iznos1;
		}
	}

}
