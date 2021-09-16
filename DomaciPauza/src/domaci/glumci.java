package domaci;

//Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean), 
//prosecna zarada po filmu, broj snimljenih filmova. 
//Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola. 
//Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore ocenjenog filma od tih pet (preko getera i setera).

public class glumci {
	public String ime;
	public String prezime;
	public int godinaRodjenja;
	public String pol;
	private boolean bracniStatus;
	private int zaradaFilm;
	private int brojFilmova;
	private int ukupnaZarada;

	public glumci(String ime, String prezime, int godinaRodjenja, String pol) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;

	}

	public glumci() {

	}

	public void infoGlumci() {
		System.out.println(mrsMr() + " " + ime + " " + prezime + " rodjen/a je " + godinaRodjenja + ". godine"
				+ ", pol " + pol + ".");
		System.out.println("Udata/oženjen " + getBracniStatus());
		System.out.println("Prosecna zarada po filmu je  " + getProsecnaZarada() + "$.");
		System.out.println("Broj filmova  " + getBrojFilmova() + ".");
		System.out.println("Ukpna zarada snimljenih filmova je  " + prosecnaZarada() + "$.");
		System.out.println("Sledece godine imace  " + godine2022() + " godina.");
	}

	public void setBracniStatus(boolean brak) {
		this.bracniStatus = brak;
	}

	public boolean getBracniStatus() {
		return this.bracniStatus;
	}

	public void setProsecnaZarada(int zarada) {
		this.zaradaFilm = zarada;
	}

	public int getProsecnaZarada() {
		return this.zaradaFilm;
	}

	public void setBrojFilmova(int brojFilmova) {
		this.brojFilmova = brojFilmova;
	}

	public int getBrojFilmova() {
		return this.brojFilmova = brojFilmova;
	}

	public int prosecnaZarada() {
		int uZarada = zaradaFilm * brojFilmova;
		return uZarada;
	}

	public String mrsMr() {

		if (pol.equalsIgnoreCase("zenski")) {
			return "Mrs";
		} else if (pol.equalsIgnoreCase("muski")) {
			return "Mr";
		}
		return null;
	}

	public int godine2022() {
		int godineSl = 2022 - godinaRodjenja;
		return godineSl;
	}

}
