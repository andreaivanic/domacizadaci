package player;
/*Kreirati klasu Video Player koja ima:
 duzinu videa
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa (144, 240, 360, 480, 720, 1080)
 getere, setere i konstruktore
 metodu stampaj koja stampa podatke u formatu:
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa
Kreirati apstraktnu klasu Control koja ima:
 apstraktnu metodu izvrsi akciju, koja kao parametar prima objekat VideoPlayer
Kreirati klasu TimeControl koja nasledjuje klasu Control i konstruktore, ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean), implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.
Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore. Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean). Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100.
Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i ima brzinu interneta u megabitima npr 10mb/s 20mb/s... Getere, setere i konstruktore. Implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
 Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima prvi veci kvalitet
 ako je brzina 20 * 10.1 = 204 - postavlja 240;
 ako je brzina 5*10.1 = 50.5 - postavlja 144;
 ako je brzina 20*10.1 = 505 - postavlja 720;
U glavnom programu kreirati video player i izvrsiti neke akcije nad njim
 U glavnom programu kreirati listu akcija i izvrsiti ih nad istim playerom*/
public class VideoPLayer {
	private int duzinaVidea;
	private int vreme;
	private int jacinaZvuka;
	private int kvalitetVideo;
	
	public VideoPLayer(int duzinaVidea, int vreme, int jacinaZvuka, int kvalitetVideo) {
		this.duzinaVidea = duzinaVidea;
		this.vreme = vreme;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVideo = kvalitetVideo;
	}

	public int getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public int getVreme() {
		return vreme;
	}

	public void setVreme(int vreme) {
		this.vreme = vreme;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public int getKvalitetVideo() {
		return kvalitetVideo;
	}

	public void setKvalitetVideo(int kvalitetVideo) {
		this.kvalitetVideo = kvalitetVideo;
	}
	
	public void stampanje() {
		System.out.println("Trenutno vreme videa: " + vreme + "\nJacina zvuka: " + jacinaZvuka +"\nKvalitet videa "+ kvalitetVideo);
		
	}
}
