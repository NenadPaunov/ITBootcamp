package flase;

public class StaklenaFlasa extends Flasa {
	private float cenaSaK;

	public StaklenaFlasa(Nalepnica nalepnica, float cenaBezK, float zapremina, String vrstaPica) {
		super(nalepnica, cenaBezK, zapremina, vrstaPica);
		if (zapremina < 0.5)
			cenaSaK = cenaBezK + 0.05f * cenaBezK;
		else
			cenaSaK = cenaBezK + 0.1f * cenaBezK;
	}

	// Potrebno za izracunavanje cene sa kaucijom - bonus.
	public float getCenaSaK() {
		return cenaSaK;
	}

	public String toString() {
		return super.toString() + "-" + "staklena.";
	}

}
