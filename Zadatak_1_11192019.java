package domaci.novi19;

import java.util.Scanner;

public class Zadatak_1_11192019 {

	public static void main(String[] args) {
		// Napisati program koji ce na standarnom izlazu ispisati poruku
		// “Niz je palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili
		// nije palindrom)

		System.out.println("Ovaj program ce na osnovu ucitanog niza ispisati da li je on Palindrom ili ne. ");

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite duzinu niza koja je pozitivni broj: ");
		int duzina = sc.nextInt();
		if (duzina <= 0) {
			System.out.println("Morate uneti pozitivni broj.");
			// Ne moze da bude palindrom ukoliko je samo jedan broj.
		} else if (duzina == 1) {
			System.out.println("Niz nije palindrom.");
		} else {
			int[] niz = new int[duzina];
			String nalepljeniNiz = "";
			String obrnutiNiz = "";
			// Inicijalizacija niza. niz.length je u ovom slucaju isto sto i duzina.
			for (int i = 0; i < niz.length; i++) {
				System.out.print("Unesite broj: ");
				niz[i] = sc.nextInt();
			}
			// Pretvaranje niza brojeva u String.
			for (int i = 0; i < niz.length; i++) {
				nalepljeniNiz += niz[i];
			}
			// Pretvaranje niza brojeva u obrnuti String.
			for (int i = niz.length - 1; 0 <= i; i--) {
				obrnutiNiz += niz[i];
			}
			// Uporedjivanje ova dva Stringa. Metoda equals se koristi za uporedjivanje
			// Stringova za razliku
			// od == koji se koriste za proste tipove(int,float,double,boolean, itd).
			if (nalepljeniNiz.equals(obrnutiNiz)) {
				System.out.println("Niz od brojeva " + nalepljeniNiz + " je palindrom.");
			} else {
				System.out.println("Niz od brojeva " + nalepljeniNiz + " nije palindrom.");
			}
		}
	}

}