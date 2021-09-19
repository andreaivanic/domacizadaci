package projekat_2;

import java.util.Scanner;

public class DomaciOdPonedeljka2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int broj = 0;
		int zbir = 0;

		while (broj >= 0) {

			System.out.print("Unesite broj: ");
			broj = s.nextInt();

			if (broj < 0) {
				break;
			} else {
				zbir = zbir + broj;
				System.out.println("Zbir pozitivnih brojeva je: " + zbir);
			}
		}

	}

}
