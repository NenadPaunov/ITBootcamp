package domaci.nov15;

import java.util.Scanner;

public class Zadatak_3_11152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

		Scanner sc = new Scanner(System.in);
		System.out.println("Ovaj program ispisuje Fibonacijev niz do unetog broja preko konzole.");
		System.out.print("Unesite celi pozitivan broj: ");
		float unos = sc.nextFloat();
		if (unos % 1 == 0 && unos > 0) {
			int prviBroj = 0;
			int drugiBroj = 1;
			if (unos == 1) {
				System.out.print("Fibonacijev niz do broja " + (int) unos + " je: ");
				System.out.print(prviBroj + ".");
			} else if (unos == 2) {
				System.out.print("Fibonacijev niz do broja " + (int) unos + " je: ");
				System.out.print(prviBroj + ", ");
				System.out.print(drugiBroj + ".");
			} else {
				System.out.print("Fibonacijev niz do broja " + (int) unos + " je: ");
				System.out.print(prviBroj + ", ");
				int suma = 0;
				int prethodni = 1;
				int naredni = 0;
				int brojac = 0;
				for (int i = 2; i < unos; i++) {
					suma = prethodni + naredni;
					System.out.print(suma);
					brojac++;
					if (brojac < unos - 2) {
						System.out.print(", ");
					} else {
						System.out.print(".");
					}
					prethodni = naredni;
					naredni = suma;
				}
			}
		} else {
			System.out.println("Morate uneti celi pozitivan broj.");
		}
	}

}
