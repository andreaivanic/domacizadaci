package package1;
/*
 Napraviti meni	
	1. Pivo
	2. Vinjak
	3. Koktel
	
	Nakon odabira pica, sledi pitanje za kolicinu
	
	Kad korisnik upise kolicinu, ispisite ukupnu cenu
	
	(cene artikala stavite kao promenljive u programu i dodelite im neke vrednosti) (edited) 
*/
import java.util.Scanner;

public class ZadatakMenu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Izaberite opciju: \n"+"1.Vino\n" + "2.Sok \n" + "3.voda");
		int opcija = s.nextInt();
		
		int vino = 100;
		int sok = 80;
		int voda = 50;
		
		int kolicina;
		int iznos=0;
		
		switch(opcija) {
		case 1: 
			System.out.println("Unesite kolicinu");
			kolicina=s.nextInt();
			iznos = kolicina*vino;
			System.out.println("Ukupna kolicina je " + iznos);
			break;
		case 2: 
			System.out.println("Unesite kolicinu");
			kolicina=s.nextInt();
			iznos = kolicina*sok;
			System.out.println("Ukupna kolicina je " + iznos);
			break;
		case 3: 
			System.out.println("Unesite kolicinu");
			kolicina=s.nextInt();
			iznos = kolicina*voda;
			System.out.println("Ukupna kolicina je " + iznos);
			break;
			default:
				opcija = 4;
				System.out.println("Izaberite jednu od ponudjenih opcija.");
		}
		s.close();
		System.out.println("Hvala na poseti.");
	}

}
