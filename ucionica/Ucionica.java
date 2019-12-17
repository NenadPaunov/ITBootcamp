package ucionica;

import java.util.ArrayList;

public class Ucionica {
	/*
	 * Napraviti paket ucionica. Unutar paketa ucionica, pisati klase.
	 * 
	 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	 * Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
	 * prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje
	 * u obliku: IME_PREZIME{ID}.
	 * 
	 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
	 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
	 * koriste laptop moze da se prosiri. Moze da se ispise u obliku (koristiti
	 * metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	 */
	public static void main(String[] args) {

		Polaznik p1 = new Polaznik("Pera", "Peric");
		p1.setIDj(1);
		Polaznik p2 = new Polaznik("Zika", "Zikic");
		p2.setIDj(2);
		Polaznik p3 = new Polaznik("Ana", "Nanic");
		p3.setIDj(3);

		// Ideja ovog nacina jeste da prvo kreiramo listu Polaznika(kako bi mogli da je
		// prosledimo objektu)
		// i da kreiramo objekat klase Laptop.
		ArrayList<Polaznik> polaznici3 = new ArrayList();
		Laptop laptop = new Laptop(polaznici3, "Amd");
		// Zatim da pomocu setera popunimo listu Polaznika koja je atribut u klasi
		// Laptop.
		laptop.setP(p1);
		laptop.setP(p2);
		laptop.setP(p3);
		System.out.println(laptop.ispisi());

		// Ovo je drugi nacin u kojem pravimo drugu listu i njoj odmah dodajemo objekte
		// klase Polaznik.
		ArrayList<Polaznik> polaznici = new ArrayList();
		polaznici.add(p1);
		polaznici.add(p2);
		polaznici.add(p3);
		// I zatim je samo prosledjujemo objektu klase Laptop.
		Laptop laptop1 = new Laptop(polaznici, "Lenovo");
		System.out.println(laptop1.ispisi());

		ArrayList<Polaznik> polaznici2 = new ArrayList();
		polaznici2.add(p1);
		polaznici2.add(p2);
		Laptop laptop2 = new Laptop(polaznici2, "Intel");
		System.out.println(laptop2.ispisi());

	}

}
