package primer01;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Ime, prezime, pol
		String ime = "Andrea";
		String prezime = "Ivanic";
		System.out.println("Ime i prezime: " + ime +" " + prezime);
		
		char pol = 'Ž';
		System.out.println("Pol: " + pol);
		
		
		//Medalje
		
		System.out.print("Broj medalja koje je Srbija osvojila na Olimpsijskim igrama: ");
		double brojMedalja = s.nextDouble();
		
		System.out.print("Broj zlatnih medalja koje je Srbija osvojila na Olimpsijskim igrama: ");
		double brojZlatnih = s.nextDouble();
		
		double percentageMedalja = ((brojZlatnih*100)/brojMedalja);
		
		System.out.print("Procenat zlatnih medalja u odnosu na ukupno osvojene je: " + percentageMedalja  + " %" );
		s.close();
	}

}
