package domaci.nov14;
import java.util.Scanner;

public class Zadatak_3_11142019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Ovaj program omogucava unosenje brojeva preko konzole sve dok se ne unese negativan broj nakon"
						+ "cega se prekida unosenje sa konzole.");

		int suma = 0;
		System.out.print("Unesite pozitivan broj: ");
		float broj = sc.nextFloat();
		if(broj%1!=0) {
			System.out.println("Morate uneti ceo broj.");
		}
		else {
		while (broj >= 0) {
			suma += broj;
			System.out.print("Unesite broj: ");
			broj = sc.nextFloat();
			while(broj%1!=0) {
				System.out.println("Morate uneti ceo broj.");
				System.out.print("Unesite broj: ");
				broj = sc.nextFloat();
			}
		}
		System.out.println("Suma unesenih pozitivnih brojeva je: " + suma + ".");
	}
	}

}
