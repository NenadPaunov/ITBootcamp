package gluma;

public class Glumac extends Zaposleni {
	private String nazivUloge;

	public Glumac(String imePrezime, Pozoriste pozoriste, String nazivUloge) {
		super(imePrezime, pozoriste);
		this.nazivUloge = nazivUloge;
	}

	public String toString() {
		return nazivUloge + "_" + super.getImePrezime() + "[" + super.getPozoriste().getNaziv() + "]";
	}
}
