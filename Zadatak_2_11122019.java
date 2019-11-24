package domaci;

import java.util.Scanner;

public class Zadatak_2_11122019 {

	public static void main(String[] args) {

		/*
		 * U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da
		 * li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut
		 * (zahtevi zadatka namerno nisu dalje razradjivani jer 1) ostavljam vasoj masti
		 * na volju 2) zelim da budem upucena u vas tok razmisljanja).
		 */

		Scanner sc = new Scanner(System.in);

		int nosivostLifta = 680;
		System.out.println("Ovaj program odredjuje da li ce lift bezbedno krenuti u zavisnosti od tezine tereta.");
		System.out.println("Unesite tezinu u kilogramima koju lift treba da ponese:");
		float tezina = sc.nextFloat();

		while (tezina < 0) {
			System.out.println("Tezina ne moze biti negativan broj. Molimo vas unesite je ponovo.");
			tezina = sc.nextFloat();
		}
		if (tezina == 0) {
			System.out.println("Lift je prazan. Da li zelite ponovo da unesete tezinu?");
			System.out.println("Ukucajte 1 ukoliko zelite.");
			System.out.println(
					"Ukucajte neki drugi broj po vasem izboru ukoliko zelite da prekinete sa izvrsavanjem programa.");
			float izbor = sc.nextFloat();
			if (izbor == 1) {
				System.out.println("Unesite ponovo tezinu:");
				tezina = sc.nextFloat();
				while (tezina < 0) {
					System.out.println("Tezina ne moze biti negativna.");
					System.out.println("Unesite ponovo tezinu:");
					tezina = sc.nextFloat();
				}
				if (tezina > 650 && tezina < 680) {
					System.out.println("Upozorenje! Lift se priblizava granici nosivosti koja iznosi 680kg.");
				} else if (nosivostLifta == tezina) {
					System.out.println("Lift je na granici nosivosti. Radi vase bezbednosti smanjite tezinu.");
				} else if (nosivostLifta > tezina) {
					System.out.println("Lift ce bezbedno krenuti.");
				} else {
					System.out.println(
							"Lift je preopterecen! Morate smanjiti tezinu ispod dozvoljene granice koja iznosi 680kg ili izjednaciti je.");
				}
			} else {
				System.out.println("Hvala sto se koristili nas program.");
			}
		} else if (tezina > 650 && tezina < 680) {
			System.out.println("Upozorenje! Lift se priblizava granici nosivosti koja iznosi 680kg.");
		} else if (nosivostLifta == tezina) {
			System.out.println("Lift je na granici nosivosti. Radi vase bezbednosti smanjite tezinu.");
		} else if (nosivostLifta > tezina) {
			System.out.println("Lift ce bezbedno krenuti.");
		} else {
			System.out.println(
					"Lift je preopterecen! Morate smanjiti tezinu ispod dozvoljene granice koja iznosi 680kg ili izjednaciti je.");
		}
	}

}
