package testovi;

import java.util.Scanner;

public class Zadatak_2_11182019 {

	public static void main(String[] args) {
		/*Ukoliko kupac kupi robu u iznosu vecem od 1500 dinara, 
		 * dobija 10% popusta, a ukoliko kupi robu u iznosu vecem od 7000 dinara dobija 20% popusta.
		 *  Napisati program koji ce za uneti iznos odabrane robe ispisati koliko zapravo treba platiti.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Unesite cenu robe: ");
		float cena=sc.nextFloat();
		
		if(cena>0) {
			if(cena>7000) {
				System.out.println("Za cenu robe od preko 7000 din dobijate 20% popusta"
						+ " i vas racun se umanjuje za iznos od 20%. Cena vase robe sa popustom je: "
						+(cena-(cena*0.2))+" din.");
			}
			else if(cena>1500) {
				System.out.println("Za cenu robe od preko 1500 din dobijate 10% popusta"
						+ " i vas racun se umanjuje za iznos od 10%. Cena vase robe sa popustom je: "
						+(cena-(cena*0.1))+" din.");
			}
			else {
				System.out.println("Vas racun za kupljenu robu je: "+cena+" din.");
			}
		}
		else {
			System.out.println("Cena robe ne moze biti 0 ili negativna.");
		}

	}

}
