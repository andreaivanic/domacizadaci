package ProjectZivotinje;

public class Staniste {
	private String[] zivotinjice;
	private String naziv;

	public Staniste(String[] zivotinjice, String naziv) {
		super();
		this.zivotinjice = zivotinjice;
		this.naziv = naziv;
	}

	public String[] getZivotinjice() {
		return zivotinjice;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setZivotinjice(String[] zivotinjice) {
		this.zivotinjice = zivotinjice;
	}

	public void stampanje() {
		System.out.println("Ovo staniste se zove: " + naziv + "\nU njemu stanistu zive:");
		for (int i = 0; i < zivotinjice.length; i++) {
			System.out.print(zivotinjice[i] + ", ");
		}
	}

}
