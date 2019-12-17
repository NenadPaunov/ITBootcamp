package dete;

public class GlavniProgramDete {
	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	 * kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda
	 * oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce ispisivati
	 * broj klikera i metodu koja ispisuje prosecan broj decjih godina (ako imamo
	 * troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo
	 * prosecne godine za to dvoje) .
	 */

	public static void main(String[] args) {
		Dete d1 = new Dete("Pera", "Peric", (byte) 12, (short) 15);
		Dete d2 = new Dete("Mika", "Mikic", (byte) 5, (short) 22);
		Dete d3 = new Dete("Laza", "Lazic", (byte) 7, (short) 4);
		Dete d4 = new Dete("Zika", "Zikic", (byte) 8, (short) 33);
		Dete d5 = new Dete("Jole", "Josic", (byte) 6, (short) 51);

		d1.dodajKlikere((short) 20);
		System.out.println(d1.ispisiKlikere(d1.getKlikeri()));
		d2.oduzmiKlikere((short) 40);
		System.out.println(d2.ispisiKlikere(d2.getKlikeri()));
		System.out.println(d4.ispisiKlikere(d4.getKlikeri()));

		System.out.println("Prosecan broj decijih godine je: " + Dete.prosecneGodineDece());
	}

}
