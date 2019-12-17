package poi;
/*Napisati program koji racuna sumu brojeva koji se nalaze prvom worksheet-u Excel tabele koji se zove Brojevi. 
 * U tabeli se svi brojevi nalaze u prvoj koloni. Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu. 
 * Krajnju sumu nakon toga treba da ispise u konzoli. Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva (isprobati!)
 */

public class Zadatak_1_12062019 {

	public static void main(String[] args) {
		try {
			ExcelUtils.setExcell("Data (DOM).xls");
			ExcelUtils.setWorkSheet(0);
			int brojRedova = ExcelUtils.getRowNumber();
			double suma = 0;
			for (int i = 0; i < brojRedova; i++) {
				suma += Double.parseDouble((ExcelUtils.getDataAt(i, 0)));
			}
			System.out.println("Suma svih brojeva u Sheetu Brojevi je: " + (int) suma);
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		} finally {
			ExcelUtils.closeExcell();
		}
	}

}
