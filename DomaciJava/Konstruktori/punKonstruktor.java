package class1;

public class punKonstruktor {

	public static void main(String[] args) {

		automobil automobil2 = new automobil("Nissan", "Juke", "4x4", 5, 2011, 200, 120);
		automobil automobil3 = new automobil("BMW", "3", "4x4", 5, 2011, 200, 120);
		automobil2.setPredjeniKm(2000);
		automobil2.getPredjeniKm();
		automobil2.podaci();
	}

}
