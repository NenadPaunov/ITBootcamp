package domaci;

import java.util.Scanner;

public class Zadatak_1_11082019 {

	public static void main(String[] args) {

		/*
		 * Zadatak: Napisi program koji ce racunati obim i povrsinu bazena, tako sto se stranice ucitavaju preko konzole.
		 * 
		 * Mali hint :) Skracenica sout takodje ispisuje System.out.println();
		 * 
		 */

		System.out.println("Trazene parametre za izracunavanje obima i povrsine bazena neophodno je uneti kao cele brojeve.");

		System.out.println("Upisite duzinu bazena:");

		Scanner sc = new Scanner(System.in);

		int duzina = sc.nextInt();

		System.out.println("Upisite sirinu bazena:");

		int sirina = sc.nextInt();

		System.out.println("Upisite dubinu bazena:");

		int dubina = sc.nextInt();

		int obim = 4 * duzina + 4 * sirina + 4 * dubina;

		int povrsina = 2 * (duzina * sirina + duzina * dubina + sirina * dubina);

		System.out.println("Obim za unete parametre bazena je: " + obim + ".");

		System.out.println("Povrsina za unete parametre bazena je: " + povrsina + ".");
		
		

		// Zatvaranje skener klase.

		sc.close();

	}

}
