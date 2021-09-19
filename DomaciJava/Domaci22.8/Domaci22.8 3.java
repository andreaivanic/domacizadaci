package primeri;

import java.util.Scanner;

public class PonedeljakDomaci3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite tri broja: ");
		int broj1 = s.nextInt();
		int broj2 = s.nextInt();
		int broj3 = s.nextInt();

		System.out.println("Zbir brojeva je: " + zbir(broj1, broj2, broj3) + ", a najveci uneti broj je: " + maxBroj(broj1, broj2, broj3));

	}

	public static int zbir(int a, int b, int c) {
		return a + b + c;
	}

	public static int maxBroj(int a, int b, int c) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		return max;
	}
}
