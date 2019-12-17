package gluma;

public class GlavniProgram {
	/*
	 * Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i
	 * naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
	 * naziv[id].
	 * 
	 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
	 * pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se
	 * sastavi tekstualni opis u obliku ime[naziv_pozorista].
	 * 
	 * Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je
	 * uloga_ime[naziv_pozorista].
	 * 
	 * Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik
	 * je nadimak_ime[naziv_pozorista].
	 * 
	 * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene
	 * koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju predstave
	 * mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
	 * Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv
	 * pozorista u kojem se predstava odrzava razdvojene zarezom, a potom zaposlene
	 * koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
	 */
	public static void main(String[] args) {

		Pozoriste pz1 = new Pozoriste("Pozoriste Bosko Buha");
		Pozoriste pz2 = new Pozoriste("Pozoriste Slavija");

		Zaposleni zp1 = new Zaposleni("Zika Zikic", pz1);
		Zaposleni zp2 = new Zaposleni("Pera Peric", pz1);
		Zaposleni zp3 = new Zaposleni("Mika Mikic", pz2);

		Glumac gl1 = new Glumac("Andrija Milosevic", pz1, "KV majstor");
		Glumac gl2 = new Glumac("Nikola Kojo", pz2, "Gospodin Gavric");

		Reditelj rd1 = new Reditelj("Ana Ninic", pz1, "Anci");
		Reditelj rd2 = new Reditelj("Dragan Bjelogrlic", pz2, "Gale");

		Predstava p1 = new Predstava("Majstor u kuci", pz1);
		Predstava p2 = new Predstava("Gavrici", pz2);

		p1.removeZaposleni(zp1);
		p1.addZaposleni(zp2);
		p1.addZaposleni(zp3);
		p1.addZaposleni(zp2);
		System.out.println("Broj zaposlenih u predstavi " + p1.getNaziv() + " je " + p1.brojZaposlenih() + ".");
		System.out.println("==================");
		System.out.println(p1);

		// System.out.println(p2.addZaposleni(zp1));
		System.out.println("===================");
		System.out.println("Broj zaposlenih u predstavi " + p2.getNaziv() + " je " + p2.brojZaposlenih() + ".");
		System.out.println(p2);

	}

}
