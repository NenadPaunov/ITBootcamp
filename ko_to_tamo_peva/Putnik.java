package ko_to_tamo_peva;

public class Putnik extends Covek {
	private float novac;

	public Putnik(String ime, String prezime, float novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public boolean dodajNovac(float novac) {
		if (novac > 0) {
			this.novac += novac;
			return true;
		}
		return false;
	}

	public boolean oduzmiNovac(float novac) {
		if (novac > 0 && novac <= this.novac) {
			this.novac -= novac;
			return true;
		}
		return false;
	}
	
	public float getNovac() {
		return this.novac;
	}
}
