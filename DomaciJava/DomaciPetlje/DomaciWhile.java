package primer01;
import java.util.Scanner;
public class DomaciWhile {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Unesite vrednost: ");
	       double r;
	       r=sc.nextDouble();
	       if(r>0){
	           System.out.println(r*r*3.14);
	       } else{
	               System.out.println("Greska u unosu!");
	           }
	}

}

