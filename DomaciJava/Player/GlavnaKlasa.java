package player;

public class GlavnaKlasa {

	public static void main(String[] args) {
		VideoPLayer p1 = new VideoPLayer(20, 30, 40, 50);
		VideoPLayer p2 = new VideoPLayer(40, 20, 40, 144);

		TimeControl t1 = new TimeControl(true);
		AudioControl a1 = new AudioControl(false);
		p1.stampanje();
		
		t1.izvrsiAkciju(p1);
		a1.izvrsiAkciju(p1);
		t1.izvrsiAkciju(p1);
		
		p1.stampanje();

	}

}
