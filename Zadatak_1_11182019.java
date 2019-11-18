package testovi;

import java.util.Scanner;

public class Zadatak_1_11182019 {

	public static void main(String[] args) {
		// Traziti od korisnika da unese pozitivan broj N. 
		//Zatim ucitavati N brojeva sa standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite pozitivan broj do kojeg ce se izvrsavati petlja:");
		int n=sc.nextInt();
		if(n>0) {
		int brojac=1;
		System.out.println("Unesite broj: ");
		float broj=sc.nextFloat();
		float najmanji=broj;
		
		while(n>brojac) {
			System.out.println("Unesite broj:");
			broj=sc.nextFloat();
			if(najmanji>broj) {
				najmanji=broj;
			}	
			brojac++;
		}
		System.out.println("Najmanji uneseni broj do "+n+" N unesenih brojeva je broj: "+najmanji+".");

		}
		else {
			System.out.println("Morate uneti pozitivan broj.");
		}
	}

}
