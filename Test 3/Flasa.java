package flase;

public class Flasa {
	private Nalepnica nalepnica;
	private float cenaBezK;
	private float zapremina = 0.33f;
	private String vrstaPica;

	public Nalepnica getNalepnica() {
		return nalepnica;
	}

	public float getCenaBezK() {
		return cenaBezK;
	}

	public void setCenaBezK(float cenaBezK) {
		this.cenaBezK = cenaBezK;
	}

	public float getZapremina() {
		return zapremina;
	}

	public String getVrstaPica() {
		return vrstaPica;
	}

	public Flasa(Nalepnica nalepnica, float cenaBezK, String vrstaPica) {
		super();
		this.nalepnica = nalepnica;
		this.cenaBezK = cenaBezK;
		this.zapremina=0.33f;
		if (vrstaPica.equals("BEZALKOHOLNO") || vrstaPica.equals("ALKOHOLNO"))
			this.vrstaPica = vrstaPica;
		else
			this.vrstaPica="Pogresno unesena vrsta pica";
	}

	public Flasa(Nalepnica nalepnica, float cenaBezK, float zapremina, String vrstaPica) {
		super();
		this.nalepnica = nalepnica;
		this.cenaBezK = cenaBezK;
		this.zapremina = zapremina;
		if (vrstaPica.equals("BEZALKOHOLNO") || vrstaPica.equals("ALKOHOLNO"))
			this.vrstaPica = vrstaPica;
		else
			this.vrstaPica="Pogresno unesena vrsta pica";
	}

	public String toString() {
		return nalepnica + "(" + cenaBezK + "," + zapremina + " litara," + vrstaPica.toUpperCase() + ").";
	}

}
