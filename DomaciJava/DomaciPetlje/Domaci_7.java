package primer01;

import java.util.Scanner;

public class Domaci_7 {

	public static void main(String[] args) {
		
		//Zadatak 3
		Scanner scann1 = new Scanner(System.in);
		
		System.out.println("Unesite iznos poluprecnika: ");
		
		double r = scann1.nextDouble();
		double pi = 3.14;
		double pR = r*r*pi;
		double oP = 2*r*pi;
		
		if(r <= 0) {
			System.out.println("Iznos poluprecnika nije validan");
		}else if(r <= 5){
			System.out.println("Povrsina kruga je: " + pR+"cm");
		}else if(r > 5 && r <= 10){
			System.out.println("Obim kruga je:" + oP+"cm");
		}else if(r > 10) {
			System.out.println("Povrsina kruga je " + pR + "cm" + ", a obim je " + oP + "cm");
		}else {
			System.out.println("Kraj programa.");
		}
		
		scann1.close();
	}
		

}
