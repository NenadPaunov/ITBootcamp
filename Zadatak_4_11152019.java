package domaci.nov15;

import java.util.Scanner;

public class Zadatak_4_11152019 {

	public static void main(String[] args) {
		/*
		 * Napisati program u kom korisnik unosi n za broj clanova Fibonacijevog niza, a
		 * ispisuje sve brojeve Fibonacijevog niza ciji je zbir cifara deljiv sa k (broj
		 * k se takodje ucitava preko tastature).
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Ovaj program ispisuje Fibonacijev niz do unetog broja preko konzole, pri cemu je zbir cifara datih brojeva deljiv"
						+ "sa brojem koji korisnik takodje unosi.");
		System.out.print("Unesite celi pozitivan broj do kojeg ce se oformiti Fibonacijev niz: ");
		float unos = sc.nextFloat();
		if (unos % 1 == 0 && unos > 0) {
			System.out.print("Unesite celi pozitivan broj: ");
			float k = sc.nextFloat();
			if (k == 0) {
				System.out.println("Deljenje sa nulom nije dozvoljeno.");
			} else if (k < 0 || k % 1 != 0) {
				System.out.println("Morate uneti celi pozitivan broj.");
			}
			else {
			int prviBroj = 0;
			int drugiBroj = 1;
			if (unos == 1) {
				System.out.print(
						"Fibonacijev niz do broja " + (int) unos + " ciji je zbir cifara deljiv sa: " + (int) k + " je: ");
				System.out.print(prviBroj + ".");
			} else if (unos == 2) {
				System.out.print("Fibonacijev niz do broja " + (int) unos + " ciji je zbir cifara deljiv sa: " +(int) k + " je: ");
				System.out.print(prviBroj + ", ");
				System.out.print(drugiBroj + ".");
			} else {
				System.out.println("Fibonacijev niz do broja " + (int) unos + " ciji je zbir cifara deljiv sa: " + (int) k + " je: ");
				System.out.println(prviBroj);
				int suma = 0;
				int prethodni = 1;
				int naredni = 0;
				int zbirCifara = 0;
				int cifra = 0;
				int pomocnaSuma = 0;
				for (int i = 2; i < unos; i++) {
					suma = prethodni + naredni;
					pomocnaSuma = suma;
					while (pomocnaSuma > 0) {
						cifra = pomocnaSuma % 10;
						pomocnaSuma = pomocnaSuma / 10;
						zbirCifara += cifra;
					}
					if (zbirCifara % (int) k == 0) {
						System.out.println(suma);						
					}
					zbirCifara = 0;
					prethodni = naredni;
					naredni = suma;
				}
			}
			}
		} else {
			System.out.println("Morate uneti celi pozitivan broj.");
		}
	}

}
