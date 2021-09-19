package primer01;

import java.util.Scanner;

public class Domaci1 {
	
	public static void main(String[]arg) {

	//Prvi zadatak
	Scanner scanner1 = new Scanner(System.in);
	
	System.out.print("Unesite duinu stranice kvadrata: ");
	
	double stranicaKvadrata = scanner1.nextDouble();
	
	double obimStranice = 4*stranicaKvadrata;
	
	System.out.println("Obim kvadrata je: " + obimStranice + "cm");
	
	double povrsinaKvadrata = stranicaKvadrata*stranicaKvadrata;
	
	System.out.println("Površina kvadrata je: " + povrsinaKvadrata + "cm");
	
	//Drugi zadatak
	
	
	System.out.print("Unesite duzinu stranice a: ");
	
	double a = scanner1.nextDouble();
	
	System.out.print("Unesite duzinu stranice b: ");
	
	double b = scanner1.nextDouble();
	
	double p = a*b;
	double o = 2*a + 2*b;
	
	System.out.println("Obim pravougaonika je: " + o + "cm");
	
	System.out.println("Površina pravougaonika je: " + p + "cm");
	
	scanner1.close();
	
	
	
}
}
