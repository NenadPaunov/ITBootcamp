package domaci.nov14;

import java.util.Scanner;

public class Zadatak_2_11142019 {

	public static void main(String[] args) {
		// Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		// od 0 do n
		// - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu vrstu
		// petlje, vec samo jednu petlju).

		Scanner sc = new Scanner(System.in);

		System.out.println("Ovaj program racuna sumu parnih brojeva i proizvod neparnih brojeva od 0 do n.");
		System.out.print("Unesite celi pozitivni broj do kojeg ce se sabirati parni brojevi, a mnoziti neparni: ");
		float broj = sc.nextFloat();
		if (broj % 1 != 0 || broj < 0) {
			System.out.println("Morate uneti celi pozitivni broj.");
		} else if (broj == 0) {
			System.out.println("Suma parnih brojeva do unetog broja: " + (int) broj + " je: 0.");
			System.out.println("Proizvod neparnih brojeva do unetog broja: " + (int) broj + " je: 0.");
		} else {
			int uslov = 0;
			int suma = 0;
			int proizvod = 1;
			while (uslov < broj) {
				if (uslov % 2 == 0) {
					suma += uslov;
				} else {
					proizvod *= uslov;
				}
				uslov++;
			}
			System.out.println("Suma parnih brojeva do unetog broja: " + (int) broj + " je: " + suma + ".");
			if (broj != 0) {
				System.out.println("Proizvod neparnih brojeva do unetog broja: " + (int) broj + " je: " + proizvod + ".");
			}
		}
	}
}
