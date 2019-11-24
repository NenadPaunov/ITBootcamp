package domaci.nov22;

import java.util.Scanner;

public class Zadatak_1_11222019 {
	/*
	 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
	 * metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
	 * ispisuje najmanji od unesenih brojeva.
	 */
	public static int proizvod(int a, int b, int c) {
		return a * b * c;
	}

	public static void najmanjiBroj(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
		} else if (c < min) {
			min = c;
		}
		System.out.println("Najmanji uneseni broj je: " + min + ".");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite prvi broj: ");
		int a = sc.nextInt();
		System.out.print("Unesite drugi broj: ");
		int b = sc.nextInt();
		System.out.print("Unesite treci broj: ");
		int c = sc.nextInt();

		System.out.println("Proizvod " + a + "*" + b + "*" + c + " je: " + proizvod(a, b, c) + ".");
		najmanjiBroj(a, b, c);
	}

}
