package projekat_2;

import java.util.Scanner;

public class DomaciUtorak1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int fr = 1;
		int it = 2;
		int srb = 3;
		int exit = 4;

		do {
			System.out.println("Odaberite opciju:  \n    1. Francuska\r\n" + "    2. Italija\n" + "    3. Srbija\n"
					+ "    4. Izlaz");
			int odgovor = s.nextInt();

			if (odgovor == 1) {
				System.out.println("Glavni grad Francuske je: ");
				String grad = s.next();
				if (grad.equals("Pariz")) {
					System.out.println("Odgovor je tačan.");
				} else {
					System.out.println("Odgovor nije tačan");
				}

				if (odgovor == 2) {
					System.out.println("Glavni grad Italije je: ");

					if (grad.equals("Rim")) {
						System.out.println("Odgovor je tačan.");
					} else {
						System.out.println("Odgovor nije tačan");
					}

					if (odgovor == 3) {
						System.out.println("Glavni grad Srbije je: ");
						if (grad.equals("Beograd")) {
							System.out.println("Odgovor je tačan.");
						} else {
							System.out.println("Odgovor nije tačan");
						}
						if (odgovor == 4) {
							System.out.println("Izašli ste iz programa.");
							break;

						}
					}
				}
			}
		} while (exit != 4);
	}
}