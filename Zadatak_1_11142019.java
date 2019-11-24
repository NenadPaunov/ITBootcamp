package domaci.nov14;

import java.util.Scanner;

public class Zadatak_1_11142019 {

	public static void main(String[] args) {
		// Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj
		// mesec ima dana.
		// (Vodite racuna o prestupnoj godini!) - za resavanje ovog zadatka koristiti
		// switch

		Scanner sc = new Scanner(System.in);

		System.out.println("Ovaj program na osnovu unete godine i dana ispisuje koliko taj mesec ima dana.");
		System.out.print("Unesite godinu: ");
		float godina = sc.nextFloat();
		if (godina % 1 != 0) {
			System.out.println("Morate uneti ceo broj.");
		} else if (godina < 0) {
			System.out.println("Godina ne moze biti negativan broj.");
		} else {
			System.out.print("Unesite naziv meseca: ");
			String mesec = sc.next().toLowerCase();

			if (godina > -1) {
				switch (mesec) {
				case "januar":
				case "mart":
				case "maj":
				case "jul":
				case "avgust":
				case "oktobar":
				case "decembar":
					System.out.println("Mesec " + mesec + " ima 31 dan.");
					break;
				case "april":
				case "jun":
				case "septembar":
				case "novembar":
					System.out.println("Mesec " + mesec + " ima 30 dana.");
					break;
				case "februar":
					if (((godina % 4 == 0) && !(godina % 100 == 0)) || (godina % 400 == 0)) {
						System.out.println("Godina " + (int)godina + " je prestupna i " + mesec + " u toj godini ima 29 dana.");
					} else {
						System.out.println("Godina " + (int)godina + " nije prestupna i " + mesec + " u toj godini ima 28 dana.");
					}
					break;
				default:
					System.out.println("Niste uneli tacan naziv meseca.");
					break;
				}
			}
		}
	}

}
