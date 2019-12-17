package ucionica;

public class Polaznik {
	private String ime;
	private String prezime;
	private int iD;

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getID() {
		return iD;
	}

	public void setIDj(int iD) {
		this.iD = iD;
	}

	public Polaznik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String ispisi() {
		return ime + "_" + prezime + "{" + iD + "}";
	}
}
