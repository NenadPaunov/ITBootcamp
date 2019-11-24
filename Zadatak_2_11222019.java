package domaci.nov22;

import java.util.Scanner;

public class Zadatak_2_11222019 {
	// Napisati program koji ucitava niz od n celih brojeva i dve metode.
	// Prva metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca
	// zbir parnih elemenata niza.

	public static int[] ucitajNiz(Scanner sc) {
		int[] niz;
		System.out.print("Upisite duzinu niza: ");
		int duzina = sc.nextInt();
		if (duzina <= 0) {
			niz = null;
		} else {
			niz = new int[duzina];
			for (int i = 0; i < niz.length; i++) {
				System.out.print("Unesite " + i + "-i element niza: ");
				niz[i] = sc.nextInt();
			}
		}
		System.out.println("Duzina niza mora biti pozitivan broj.");
		return niz;
	}

	public static int proizvodNeparnihPozicija(int[] niz) {
		int proizvod = 1;
		if (niz == null) {
			return proizvod = 0;
		} else {
			for (int i = 1; i < niz.length; i = i + 2) {
				proizvod *= niz[i];
			}
		}
		return proizvod;
	}

	public static int zbirParnihElemenata(int[] niz) {
		int zbir = 0;
		if (niz == null) {
			return zbir;
		} else {
			for (int i = 0; i < niz.length; i++) {
				if (niz[i] % 2 == 0) {
					zbir += niz[i];
				}
			}
		}
		return zbir;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] niz = ucitajNiz(sc);
		System.out.println("Proizvod elemenata niza na neparnim pozicijama je: " + proizvodNeparnihPozicija(niz));
		System.out.println("Zbir parnih elemenata niza je: "+zbirParnihElemenata(niz));
	}

}
