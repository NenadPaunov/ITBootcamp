package domaci;

import java.util.Scanner;

public class Zadatak_1_11122019 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji proverava da li je uneti broj paran ili neparan.
		 * Ukoliko jeste, program treba da ispise poruku: Broj je paran! Ukoliko nije,
		 * program treba da ispise poruku: Broj je neparan!
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj kako bi program odredio da li je u pitanju paran ili neparan broj:");
		float broj = sc.nextFloat();

		if(broj%1==0) {
		if (broj % 2 == 0) {
			System.out.println("Uneti broj je paran.");
		} else {
			System.out.println("Uneti broj je neparan.");
		}
	}
	
	else {
		System.out.println("Decimalni broj ne moze biti paran ili neparan. Vratite se u osnovnu skolu :)");
	}
	}
}
