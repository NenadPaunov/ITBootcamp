package flase;

public class PlasticnaFlasa extends Flasa {
	private float cenaSaK;

	public PlasticnaFlasa(Nalepnica nalepnica, float cenaBezK, float zapremina, String vrstaPica) {
		super(nalepnica, cenaBezK, zapremina, vrstaPica);
		this.cenaSaK = cenaBezK;
	}

	// Potrebno za izracunavanje cene flase sa kaucijom - bonus.
	public float getCenaSaK() {
		return cenaSaK;
	}

	public String toString() {
		return super.toString() + "-" + "plasticna.";
	}
}
