package ProjectZivotinje;

public class Ribe extends Zivotinje {
	private String kvalitetVode;
	private int brojPeraja;
	private String vrstaPeraja;

	public Ribe(String vrsta, String ime, String ishrana, String kvalitetVode, int brojPeraja, String vrstaPeraja) {
		super(vrsta, ime, ishrana);
		this.kvalitetVode = kvalitetVode;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}


	public String getKvalitetVode() {
		return kvalitetVode;
	}

	public void setKvalitetVode(String kvalitetVode) {
		this.kvalitetVode = kvalitetVode;
	}

	public int getBrojPeraja() {
		return brojPeraja;
	}

	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	} 
	
	public void stampanje() {
		super.stampanje();
		System.out.println("Riba ima " + brojPeraja +" peraja koja su " + vrstaPeraja + ".");
	}

}
