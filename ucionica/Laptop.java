package ucionica;

import java.util.ArrayList;

public class Laptop {
	private ArrayList<Polaznik> p;
	private String marka;

	public ArrayList<Polaznik> getP() {
		return p;
	}

	public String getMarka() {
		return marka;
	}

	public void setP(Polaznik p) {
		this.p.add(p);
	}

	public Laptop(ArrayList<Polaznik> p, String marka) {
		super();
		this.p = p;
		this.marka = marka;
	}

	public String ispisi() {
		String ispis = marka + "{";
		int brojac = 0;
		for (int i = 0; i < p.size(); i++) {
			ispis += p.get(i).ispisi();
			brojac++;
			if (brojac < p.size()) {
				ispis += ", ";
			}
		}
		return ispis += "}.";
	}
}
