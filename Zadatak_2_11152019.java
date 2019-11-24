package domaci.nov15;

import java.util.Scanner;

public class Zadatak_2_11152019 {

	public static void main(String[] args) {
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz m=3, n=7; Izlaz (vidljivo u konzoli) Hint: koristiti dve for
		 * petlje
		 */
		System.out.println("Ovaj program ispisuje sliku pravougaonika od zvezdica.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Upisite sirinu(celi broj) pravougaonika od zvezdica: ");
		float sirina = sc.nextFloat();
		if (sirina % 1 != 0||sirina<=0) {
			System.out.println("Sirina mora biti celi pozitivni broj.");
		} else {
			System.out.print("Upisite duzinu(celi broj) pravougaonika od zvezdica: ");
			float duzina = sc.nextFloat();
			if (duzina % 1 != 0||duzina<=0) {
				System.out.println("Duzina mora biti celi pozitivni broj.");
			} else if (sirina == duzina) {
				System.out.println("Uneli ste iste dimenzije. Neophodno je da budu razlicite kako bi program mogao"
						+ " da kreira pravougaonik.");
			} else if(sirina>0&&duzina>0){
				for (int i = 0; i < sirina; i++) {
					for (int j = 1; j < duzina; j++) {
						System.out.print("*\t");
					}
					System.out.println("*");
				}
			}
		}
	}
}
