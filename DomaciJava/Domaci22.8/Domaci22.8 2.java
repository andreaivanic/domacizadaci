package primeri;

import java.util.Scanner;

public class DomaciPonedeljak2 {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Unesite 3 cela broja: ");
	int broj1=s.nextInt();
	int broj2=s.nextInt();
	int broj3=s.nextInt();
	
	System.out.println("Proizvod unetih brojeva je: " + proizvodBrojeva(broj1, broj2, broj3));
	}
	public static int proizvodBrojeva(int a, int b, int c) {
		int suma = a*b*c;
		return suma;
	}
}
