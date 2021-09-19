package player;

public class TimeControl extends Control {

	private boolean pomeraVreme;

	public TimeControl(boolean pomeraVreme) {
		super();
		this.pomeraVreme = pomeraVreme;
	}

	@Override
	public void izvrsiAkciju(VideoPLayer pl) {
		if (!pomeraVreme) {
			if (pl.getVreme() > 15) {
				pl.setVreme(pl.getVreme() - 15);
			} else {
				pl.setVreme(0);
			}
		} else {
			if (pl.getDuzinaVidea() - pl.getVreme() > 15) {
				pl.setVreme(pl.getVreme() + 15);
			} else {
				pl.setVreme(pl.getVreme());
			}

		}
	}
}
