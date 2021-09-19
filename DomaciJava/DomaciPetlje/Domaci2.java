package primer01;

import java.util.Scanner;

public class Domaci2 {
	
	public static void main(String[]arg) {
		
		Scanner scanner3 = new Scanner(System.in);
		
		System.out.print("Unesite Vaše ime: ");
		String ime = scanner3.nextLine();
		
		System.out.print("Unesite Vaše prezime: ");
		String prezime = scanner3.nextLine();
	
		System.out.print("Unesite poluprecink kruznice: ");
		double r = scanner3.nextDouble();
		
		double o = 2 * r * 3.14;
		double p = 3 * r * 3.14;
		
		System.out.print("Rezultati za " + ime + " " + prezime + " su " + "obim: " + o + "cm" + ",a povrsina:"+ p + "cm");
		
	
		
}
}
