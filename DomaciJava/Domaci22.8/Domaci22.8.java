package primeri;

import java.util.Scanner;

public class DomaciPonedeljak {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj: ");
		int broj1 = s.nextInt();
		int broj2 = s.nextInt();
		int broj3 = s.nextInt();

		System.out.println("Najmanji uneti broj je: " + minUkupnihBrojeva(broj1, broj2, broj3));
	}

	public static int minUkupnihBrojeva(int a, int b, int c) {
		if (a >= b) {
			int d = a;
			a = b;
			b = d;
		}
		if (a <= c) {
			return a;
		} else {
			return c;
		}
	}
}
