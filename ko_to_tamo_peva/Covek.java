package ko_to_tamo_peva;

public class Covek {
	private String ime;
	private String prezime;
	private int iD;
	private static int pomId;

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getiD() {
		return iD;
	}

	public Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.iD = pomId++;
	}

}
