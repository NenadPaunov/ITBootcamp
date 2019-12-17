package dete;

public class Dete {
	private String ime;
	private String prezime;
	private byte godine;
	private short brojKlikera;
	private static float prosecneGodine;
	private static byte brojDece;

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public byte getGodine() {
		return godine;
	}

	public float getProsecneGodine() {
		return prosecneGodine;
	}

	public short getKlikeri() {
		return brojKlikera;
	}

	public short dodajKlikere(short brojKlikera) {
		if (brojKlikera > 0) {
			this.brojKlikera += brojKlikera;
			return this.brojKlikera;
		} else {
			System.out.println("Broj klikera mora biti pozitivan broj.");
			return this.brojKlikera;
		}
	}

	public short oduzmiKlikere(short brojKlikera) {
		if (brojKlikera > this.brojKlikera) {
			System.out.println("Nemate dovoljno klikera. Ne mozete uzeti vise (trazili ste " + brojKlikera
					+ ") od onog broja koji je trenutno na stanju: " + this.brojKlikera);
			return this.brojKlikera;
		} else if (brojKlikera < 1) {
			System.out.println("Broj klikera koji zelite da uzmete mora biti pozitivan broj.");
			return this.brojKlikera;
		} else {
			return this.brojKlikera -= brojKlikera;
		}
	}

	public String ispisiKlikere(short brojKlikera) {
		return "Broj klikera koje " + ime + " ima je: " + brojKlikera;
	}

	public Dete(String ime, String prezime, byte godine, short brojKlikera) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.brojKlikera = brojKlikera;
		prosecneGodine += godine;
		brojDece++;
	}

	public static float prosecneGodineDece() {
		return prosecneGodine / brojDece;
	}

}
