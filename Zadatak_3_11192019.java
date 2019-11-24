package domaci.novi19;

import java.util.Scanner;

public class Zadatak_3_11192019 {

	public static void main(String[] args) {
		// Ucitati duzinu niza i clanove preko konzole i odrediti da li su palindromi
		// ili ne.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ovaj program odredjuje da li je ucitani clan niza palindrom ili ne.");
		System.out.print("Unesite duzinu niza koja je pozitivni broj: ");
		int duzina = sc.nextInt();
		if (duzina <= 0) {
			System.out.println("Morate uneti pozitivni broj.");
		} else {
			// Popunjavanje niza preko konzole:
			int[] niz = new int[duzina];
			for (int i = 0; i < niz.length; i++) {
				System.out.print("Unesite clan niza koji se nalazi na mestu broj " + i + " u nizu :");
				niz[i] = sc.nextInt();
			}
			// Citanje jednog po jednog clana niza:
			for (int j = 0; j < niz.length; j++) {
				// Ukoliko je clan niza jednocifren broj onda on ne moze biti palindrom.
				if (niz[j] / 10 == 0) {
					System.out.println("Broj " + niz[j] + " nije palindrom.");
				} else {
					int cifra = 0;
					String brojevi = "";
					int pomocna = niz[j];
					int brojac = 0;
					// Zbog lepljenja brojeva na String neophodno je da broj bude pozitivan inace ce izbaciti gresku,
					// a kasnije uz pomoc brojaca cemo ga vratiti da bude negativan.
					if (pomocna < 0) {
						pomocna *= -1;
						brojac++;
					}
					// Izvlacenje poslednje cifre i njeno dodavanje na String:
					while (pomocna > 0) {
						cifra = pomocna % 10;
						pomocna /= 10;
						brojevi += cifra;
					}
					// Ukoliko je broj niza bio negativan, uz pomoc brojaca ga vracamo da bude
					// negativan.
					if (brojac == 1) {
						brojevi = "-" + brojevi;
					}
					// Proveravanje da li je palindrom i pretvaranje Stringa u integer.
					if (niz[j] == Integer.parseInt(brojevi)) {
						System.out.println("Broj " + niz[j] + " je palindrom.");
					} else {
						System.out.println("Broj " + niz[j] + " nije palindrom.");
					}
				}
			}
		}

	}

}
