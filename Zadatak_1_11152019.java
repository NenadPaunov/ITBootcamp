package domaci.nov15;

public class Zadatak_1_11152019 {

	public static void main(String[] args) {
		// Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.

		System.out.println("Ovaj program racuna koliko brojeva deljivih sa 3 ima izmedju 9 i 250 ukljucujuci i njih.");
		int brojac=0;
		for (int i = 9; i <=250; i++) {
			if(i%3==0) {
				brojac++;
			}
		}
		System.out.println("Brojevi od 9 do 250 ukljucujuci i njih deljivih sa 3 ima: "+brojac);
	}

}
