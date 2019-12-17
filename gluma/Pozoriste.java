package gluma;

public class Pozoriste {
	private String naziv;
	private int iD;
	private static int globalId;

	public String getNaziv() {
		return naziv;
	}

	public int getiD() {
		return iD;
	}

	public Pozoriste(String naziv) {
		super();
		this.naziv = naziv;
		this.iD = globalId++;
	}

	public String toString() {
		return naziv + "[" + iD + "]";
	}
}
