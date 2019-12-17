package ko_to_tamo_peva;

public class Vozac extends Covek{
private String zanimanje;

public Vozac(String ime, String prezime, String sofer) {
	super(ime, prezime);
	this.zanimanje = sofer;
}

@Override
public String toString() {
	return "Vozac [ime: "+super.getIme()+", prezime: "+super.getPrezime()+", id: "+super.getiD()+", zanimanje: " + zanimanje + "]";
}

}
