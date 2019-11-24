package domaci;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_3_11122019 {

	public static void main(String[] args) {

		/*
		 * Bonus zadatak(koristeci granjanje): Napisi program koji ce racunati obim i
		 * povrsinu bazena, tako sto se stranice ucitavaju preko konzole.
		 */
		System.out.println("Ovaj program izracunava obim i povrsinu bazena u zavisnosti od njegovog oblika i dimenzija.");
		System.out.println("Izaberite vas tip bazena unosom broja stavke:");
		System.out.println("1) Kocka;");
		System.out.println("2) Kvadar;");
		System.out.println("3) Valjak;");
		System.out.println("4) Ostalo;");

		Scanner sc = new Scanner(System.in);
		float izbor = sc.nextFloat();
		float duzina, sirina, dubina, poluprecnik, obim, povrsina;
		DecimalFormat df = new DecimalFormat("#.00");

		if (izbor == 1) {
			System.out.println("Izabrali ste bazen u obliku kocke.");
			System.out.println("Unesite duzinu bazena:");
			duzina = sc.nextFloat();
			while (duzina <= 0) {
				System.out.println("Uneta vrednost mora biti veca od nule!");
				System.out.println("Unesite ponovo duzinu bazena:");
				duzina = sc.nextFloat();
			}
			obim = 6 * (duzina + duzina);
			povrsina = 5 * (duzina * duzina);
			System.out.println("Obim bazena u obliku kocke je: " + df.format(obim));
			System.out.println("Povrsina bazena u obliku kocke je: " + df.format(povrsina));

		} else if (izbor == 2) {
			System.out.println("Izabrali ste bazen u obliku kvadra.");
			System.out.println("Unesite duzinu bazena:");
			duzina = sc.nextFloat();
			while (duzina <= 0) {
				System.out.println("Uneta vrednost mora biti veca od nule!");
				System.out.println("Unesite ponovo duzinu bazena:");
				duzina = sc.nextFloat();
			}
			System.out.println("Unesite sirinu bazena:");
			sirina = sc.nextFloat();
			while (sirina <= 0) {
				System.out.println("Uneta vrednost mora biti veca od nule!");
				System.out.println("Unesite ponovo sirinu bazena:");
				sirina = sc.nextFloat();
			}
			System.out.println("Unesite dubinu bazena:");
			dubina = sc.nextFloat();
			while (dubina <= 0) {
				System.out.println("Uneta vrednost mora biti veca od nule!");
				System.out.println("Unesite ponovo dubinu bazena:");
				dubina = sc.nextFloat();
			}
			obim = 4 * (duzina + sirina + dubina);
			povrsina = 2 * (duzina * dubina + sirina * dubina) + (dubina * sirina);
			if (duzina == sirina && duzina == dubina) {
				System.out.println("Imate bazen u obliku kocke,a ne kvadrata.");
				System.out.println("Obim bazena u obliku kocke je: " + df.format(obim));
				System.out.println("Povrsina bazena u obliku kocke je: " + df.format(povrsina));
			} else {
				System.out.println("Obim bazena u obliku kvadra je: " + df.format(obim));
				System.out.println("Povrsina bazena u obliku kvadra je: " + df.format(povrsina));
			}
		}

		else if (izbor == 3) {
			System.out.println("Izabrali ste bazen u obliku valjka.");
			System.out.println("Unesite dubinu bazena:");
			dubina = sc.nextFloat();
			while (dubina <= 0) {
				System.out.println("Uneta vrednost mora biti veca od nule!");
				System.out.println("Unesite ponovo dubinu bazena:");
				dubina = sc.nextFloat();
			}
			System.out.println("Unesite poluprecnik bazena");
			poluprecnik = sc.nextFloat();
			while (poluprecnik <= 0) {
				System.out.println("Uneta vrednost mora biti veca od nule!");
				System.out.println("Unesite ponovo poluprecnik bazena:");
				poluprecnik = sc.nextFloat();
			}
			// Izvedena formula u koju bas i ne polazem previse nade :)
			obim = (float) (4 * poluprecnik * Math.PI + 2 * (2 * poluprecnik * Math.PI + dubina));
			/*
			 * Formula uzeta sa sajta:
			 * https://profesorka.wordpress.com/2013/05/02/povrsina-valjka/
			 */
			povrsina = (float) (Math.pow(poluprecnik, poluprecnik) * Math.PI + 2 * poluprecnik * Math.PI * dubina);
			System.out.println("Obim bazena u obliku valjka je: " + df.format(obim));
			System.out.println("Povrsina bazena u obliku valjka je: " + df.format(povrsina));

		} else if (izbor == 4) {
			System.out.println("Zaposlite inzenjera :)");

		} else {
			System.out.println("Niste izabrali nijednu od ponudjenih opcija, molimo vas pokusajte ponovo.");
		}
	}

}
