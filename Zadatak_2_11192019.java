package domaci.novi19;

import java.util.Scanner;

public class Zadatak_2_11192019 {

	public static void main(String[] args) {
		// Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		// niza
		// koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)

		Scanner sc = new Scanner(System.in);
		System.out.println("Ovaj izracunava proizvod ucitanih elemata niza koji su veci od svog indexa u nizu ciju duzinu"
				+ " odredjuje korisnik.");
		System.out.print("Unesite duzinu niza koja je pozitivni broj: ");
		int duzina = sc.nextInt();
		if (duzina <= 0) {
			System.out.println("Morate uneti pozitivni broj.");
		} else {
			float[] niz = new float[duzina];
			// Popunjavanje niza sa elementima koji se unose preko konzole(Skenera).
			for (int i = 0; i < niz.length; i++) {
				System.out.print("Unesite clan niza koji se nalazi na mestu broj " + i + " u nizu :");
				niz[i] = sc.nextFloat();
			}
			float proizvod = 1;
			// Ispitivanje da li je element niza veci od svog indexa i ukoliko jeste,
			// njegovo mnozenje sa ostalim elementima.
			for (int i = 0; i < niz.length; i++) {
				if (i < niz[i]) {
					proizvod *= niz[i];
				}
			}
			System.out.println("Proizvod je: " + proizvod);
		}
	}

}
