package ko_to_tamo_peva;

public class GlavniProgram {
	/*
	 * Covek poseduje ime i prezime, i jedinstveni identifikacioni broj koji se
	 * dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i
	 * postave.
	 * 
	 * Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	 * 
	 * Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu
	 * novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu
	 * se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
	 * 
	 * Autobus poseduje naziv, vozaca, cenu karte i niz putnika koji se njime voze.
	 * Naziv, cena karte i broj mesta zadaju se prilikom kreiranja. Moguce je
	 * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
	 * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
	 * - Putnik1[novac], Putnik2 [novac],... )
	 * 
	 */
	public static void main(String[] args) {
		Covek cv = new Covek("Pera", "Peric");

		Vozac vz = new Vozac("Zika", "Zikic", "sofer");
		Vozac vz2 = new Vozac("Pera", "Peric", "sofer");
		Vozac vz3 = new Vozac("Andrija", "Andrejevic", "sofer");

		Putnik p = new Putnik("Ana", "Anic", 4000);
		Putnik p2 = new Putnik("Nemanja", "Anic", 2000);
		Putnik p3 = new Putnik("Stefan", "Stefanovic", 10000);
		Putnik p4 = new Putnik("Belka", "Belkic", 6500.4F);
		Putnik p5 = new Putnik("Rale", "Rajic", 4000);

		p.dodajNovac(500.45F);

		Autobus at = new Autobus("Lasta", 200, 2);
		Autobus at2 = new Autobus("Sinobus", 200, -3);
		Autobus at3 = new Autobus("Eko", 100, 2);

		System.out.println("==============PRVI AUTOBUS:=================");
		at.addVozac(vz);
		System.out.println(at.getVozac());
		System.out.println(at.addVozac(vz2));
		System.out.println(at.getVozac());
		System.out.println(at.removeVozac());
		System.out.println(at.getVozac());
		System.out.println(at.addVozac(vz3));
		System.out.println(at.getVozac());

		System.out.println("=========================");
		System.out.println(at.addP(p));
		System.out.println(at.addP(p2));
		System.out.println(at.addP(p3));
		System.out.println(at.addP(p4));

		System.out.println(at.removeP(p));
		System.out.println(at.addP(p5));
		System.out.println("==========================");
		at.ispisiPutnici();

		at.payTicket();

		System.out.println("========================");
		System.out.println(at);

		at.removeVozac();
		at.payTicket();
		System.out.println(at);
		System.out.println("===================DRUGI AUTOBUS:================");
		at2.addVozac(vz2);
		System.out.println(at2.getVozac());

		System.out.println(at2.addP(p5));
		System.out.println(at2.addP(p3));
		System.out.println(at2.removeP(p5));
		at2.ispisiPutnici();

		at2.payTicket();
		System.out.println(at2);
	}

}
