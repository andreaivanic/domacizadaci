package class1;

public class prazanKonstruktor {

	public static void main(String[] args) {
		automobil automobil1 = new automobil();
		automobil1.marka = "Audi";
		automobil1.model = "Q5";
		automobil1.pogon = "4x4";
		automobil1.godiste = 2020;
		automobil1.brojVrata = 5;
		automobil1.kubikaza= 1000;
		automobil1.cena= 120;
		
		automobil1.setPredjeniKm(20000);
		automobil1.podaci();

	}

}
