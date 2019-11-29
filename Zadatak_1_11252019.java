package test;

import java.util.Scanner;

public class Zadatak_1_11252019 {
	/*
	 * Napisati program koji od korisnika trazi da unese koliko na testu ima
	 * pitanja. Zatim, koristeci metodu, ucitava ime i prezime studenta, kao i da li
	 * je za svako pitanje odgovor koji je student dao tacan ili netacan. Napraviti
	 * ( i na odgovarajucem mestu pozvati) metodu kojoj je povratna vrednost String
	 * i ispisati poruku koja daje informaciju o tome da li je student pao ili
	 * polozio ispit, kao i koliko ima tacnih odgovora. (Polozio je ako ima vise od
	 * 50%) Ukoliko student nije polozio, napisati koliko poena mu fali da bi ocena
	 * bila prelazna. Moguce je iskoristiti metodu iz prethodne tacke i dopuniti je.
	 * 
	 * Bonus zahtev: Omoguciti korisniku (profesoru) da unosi informacije o
	 * studentima sve dok ne unese rec ‘stop’. (Broj pitanja na testu unosi samo
	 * jednom, na pocetku izvrsavanja programa)
	 * 
	 * Poredjenje dva String-a na jednakost ne vrsi se pomocu == vec
	 * string1.equals(string2)
	 */
	public static String ucitajStudenta(Scanner sc) {
		System.out.print("Unesite ime studenta: ");
		String imePrezime = "";
		imePrezime = sc.next() + " ";
		System.out.print("Unesite prezime studenta: ");
		imePrezime += sc.next();
		return imePrezime;
	}

	public static int ucitajOdgovoreStudenta(Scanner sc, float brojPitanja) {
		int brojPolozenihIspita = 0;
		String odgovor;
		System.out.println("Da li je student tacno odgovorio na pitanje ili ne?"
				+ " Za tacan odgovor ukucajte: tacno, za netacan: netacno.");
		for (int i = 0; i < brojPitanja; i++) {
			System.out.print("Na " + (i + 1) + "-o pitanje, student je odgovorio:");
			odgovor = sc.next();
			if (odgovor.equalsIgnoreCase("tacno")) {
				brojPolozenihIspita++;
			} else if (odgovor.equalsIgnoreCase("netacno")) {
			} else {
				System.out.println("Uneli ste pogresan odgovor, molimo vas pokusajte ponovo.");
				i--;
			}
		}
		return brojPolozenihIspita;
	}

	public static String uspehNaIspitu(Scanner sc, float brojPitanja) {
		String pom;
		String tacan = " tacan odgovor.";
		String tacna = " tacna odgovora.";
		String tacnih = " tacnih odgovora.";
		int polozeni = ucitajOdgovoreStudenta(sc, brojPitanja);
		//Koliko je potrebno jos ispita da polozi za prolaz
		int nepolozeni = (int) (brojPitanja - (polozeni + 1));
		float procenat=100*polozeni/brojPitanja;
		if (brojPitanja / 2 < polozeni) {
			pom = "Student je polozio ispit i ima ukupno " + polozeni;
			if (polozeni == 1) {
				pom += tacan;
			} else if (polozeni == 2 || polozeni == 3) {
				pom += tacna;
			} else {
				pom += tacnih;
			}
			pom+=" Osvojio je ukupno "+procenat+" procenata.";
		} else {
			pom = "Student je pao ispit i ima ukupno " + polozeni;
			if (polozeni == 1) {
				pom += tacan;
			} else if (polozeni == 2 || polozeni == 3) {
				pom += tacna;
			} else {
				pom += tacnih;
			}
			pom += "Za prolaz mu je potrebno jos " + nepolozeni;
			if (polozeni == 1) {
				pom += tacan;
			} else if (nepolozeni == 2 || nepolozeni == 3) {
				pom += tacna;
			} else {
				pom += tacnih;
			}
			pom+=" Osvojio je ukupno "+procenat+" procenata.";
		}
		return pom;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite koliko na testu ima pitanja: ");
		float brojPitanja = sc.nextFloat();
		if (brojPitanja > 0) {
			String stop = "";
			do {
				System.out.println("Student " + ucitajStudenta(sc) + ":");
				System.out.println(uspehNaIspitu(sc, brojPitanja));
				System.out.print("Ukoliko ne zelite vise da unosite informacije o studentima ukucajte rec stop"
						+ " u suprotnom unesite bilo koju drugu rec:");
				stop = sc.next();
			} while (!(stop.equalsIgnoreCase("stop")));
			System.out.println("Hvala sto ste koristili nas program.");
		} else {
			System.out.println("Broj pitanja na testu mora biti pozitivan broj.");
		}
	}

}
