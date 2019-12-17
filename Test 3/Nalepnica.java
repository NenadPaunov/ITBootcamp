package flase;

public class Nalepnica {
	private String naziv;
	private int iD;
	private static int globalId;

	public int getiD() {
		return iD;
	}

	public Nalepnica(String naziv) {
		super();
		this.naziv = naziv;
		this.iD = globalId++;
	}

	public String toString() {
		return naziv + ":" + iD;
	}

}
