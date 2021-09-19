package player;

public class AudioControl extends Control {
	private boolean volumen;

	public AudioControl(boolean volumen) {
		super();
		this.volumen = volumen;
	}

	@Override
	public void izvrsiAkciju(VideoPLayer pl) {
		if (!this.volumen) {
			if (pl.getJacinaZvuka() > 0) {
				pl.setJacinaZvuka(pl.getJacinaZvuka() - 1);
			} else {
				System.out.println("Zvuk iskljucen");
			}
		} else {
			if (pl.getJacinaZvuka() < 100) {
				pl.setJacinaZvuka(pl.getJacinaZvuka() + 1);
			} else {
				System.out.println("Zvuk je maksimalno pojacan.");
			}
		}

	}
}