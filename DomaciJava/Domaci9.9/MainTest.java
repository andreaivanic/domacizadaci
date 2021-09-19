package domaci;

public class MainTest {

	public static void main(String[] args) {
		Covek covek1 = new Covek("Jovan Jovanovic");
		System.out.println(covek1);
		
		Vozac vozac1= new Vozac("Petar Petrovic","Sofer");
		
		System.out.println(vozac1);
		
		Putnik putnik1= new Putnik("Ana Petrovic", 200);
		
		System.out.println(putnik1);
		
	}

}
