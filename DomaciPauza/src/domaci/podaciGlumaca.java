package domaci;

import java.util.ArrayList;

public class podaciGlumaca {

	public static void main(String[] args) {
		glumci glumac1 = new glumci("Angelina", "Jolie", 1975, "zenski");
		glumci glumac2 = new glumci("Brad", "Pitt", 1963, "muski");

		ArrayList<Object> filmovi = new ArrayList();

		filmovi.add("Those Who Wish Me Dead(6.0)");
		filmovi.add("The One and Only Ivan(6.6)");
		filmovi.add("Come Away(5.8)");
		filmovi.add("Maleficent: Mistress of Evil (6.6)");
		filmovi.add("Mon Guerlain: Notes of a Woman(6.1)");

		Object alt = filmovi.get(2);
		Object alt1 = filmovi.get(0);
		filmovi.set(0, filmovi.get(3));
		filmovi.set(3, alt1);
		alt = filmovi.get(2);
		filmovi.set(2, filmovi.get(4));
		filmovi.set(4, alt);

		for (int i = 0; i < filmovi.size(); i++) {
			System.out.println((i + 1) + ". " + filmovi.get(i));
		}

		glumac1.setBracniStatus(true);
		glumac1.setProsecnaZarada(30000);
		glumac1.setBrojFilmova(45);
		glumac1.infoGlumci();

		glumac2.setBracniStatus(false);
		glumac2.setProsecnaZarada(10000);
		glumac2.setBrojFilmova(25);
		glumac2.infoGlumci();
	}

}
