package gluma;

public class Zaposleni {
	private String imePrezime;
	private Pozoriste pozoriste;

	public String getImePrezime() {
		return imePrezime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public Zaposleni(String imePrezime, Pozoriste pozoriste) {
		super();
		this.imePrezime = imePrezime;
		this.pozoriste = pozoriste;
	}

	public String toString() {
		return imePrezime + "[" + pozoriste.getNaziv() + "]";
	}
}
