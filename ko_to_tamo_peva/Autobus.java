package ko_to_tamo_peva;

import java.util.Arrays;
import java.util.Iterator;

public class Autobus {
	private String naziv;
	private Vozac vozac;
	private float cenaKarte;
	private Putnik[] putnici;

	public Autobus(String naziv, float cenaKarte, int brojSedista) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		if (brojSedista > 0)
			this.putnici = new Putnik[brojSedista];
		else {
			this.putnici = null;
		}
	}

	public Vozac getVozac() {
		return vozac;
	}

	public boolean addVozac(Vozac v) {
		if (v != null && this.vozac == null) {
			this.vozac = v;
			return true;
		}
		return false;
	}

	public boolean removeVozac() {
		if (this.vozac != null) {
			this.vozac = null;
			return true;
		}
		return false;
	}

	public void ispisiPutnici() {
		if (putnici != null) {
			for (Putnik p : putnici) {
				if (p != null)
					System.out.println(p.getIme());
			}
		} else {
			System.out.println("Autobus nema sedista.");
		}
	}

	public boolean addP(Putnik p) {
		if (putnici == null) {
			return false;
		}
		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] == null) {
				putnici[i] = p;
				return true;
			}
		}
		return false;
	}

	public boolean removeP(Putnik p) {
		if (putnici == null) {
			return false;
		}
		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] == p) {
				putnici[i] = null;
				return true;
			}
		}
		return false;
	}

	public void payTicket() {
		if (vozac != null && putnici != null) {
			for (Putnik k : putnici) {
				if (k != null) {
					k.oduzmiNovac(this.cenaKarte);
				}
			}
		}
	}

	@Override
	public String toString() {
		String s = this.naziv + " ( ";
		if (vozac != null)
			s += vozac.toString();
		if (putnici != null) {
			for (Putnik p : putnici) {
				if (p != null) {
					s += p.getIme() + " " + p.getPrezime() + " " + p.getiD() + "[" + p.getNovac() + "]" + "  ";
				}
			}
		}
		return s += ")";
	}

}
