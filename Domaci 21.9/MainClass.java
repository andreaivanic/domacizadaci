package SeleniumOsnove;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		HappyPath happy = new HappyPath();
		SadPath sad = new SadPath();
		
		int opcija;
		
		System.out.println("Izaberite opciju: \n1. HappyPath \n2. SadPath");
		opcija = scan.nextInt();
		
		switch(opcija) {
		case 1: 
			happy.happyPath();
			break;
			
		case 2: 
			sad.sadPath();
			break;
		}

	}

}
