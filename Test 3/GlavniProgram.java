package flase;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		Nalepnica np1=new Nalepnica("Zajecarsko");
		Nalepnica np2=new Nalepnica("Fanta");
		Nalepnica np3=new Nalepnica("Jelen");
		
		Flasa f1=new Flasa(np1,100f,"ALKOHOLNO");
		Flasa f2=new Flasa(np2, 200f, 2f, "BEZALKOHOLNO");
		Flasa f3=new Flasa(np3, 50f, "sok");
		
		StaklenaFlasa sf1=new StaklenaFlasa(np1, 100, 0.4f, "ALKOHOLNO");
		StaklenaFlasa sf2=new StaklenaFlasa(np3, 1000, 10f, "BEZALKOHOLNO");
		StaklenaFlasa sf3=new StaklenaFlasa(np2, 50, 0.5f, "Sok");
		
		PlasticnaFlasa pf1=new PlasticnaFlasa(np3, 150, 2, "ALKOHOLNO");
		PlasticnaFlasa pf2=new PlasticnaFlasa(np2, 50.5f, 0.2f, "Pivo");

		List<Flasa> flase=new ArrayList();
		flase.add(f1);
		flase.add(f2);
		flase.add(f3);
		flase.add(sf1);
		flase.add(sf2);
		flase.add(sf3);
		flase.add(pf1);
		flase.add(pf2);
		
		float suma=0;
		for(Flasa f:flase) {
			suma+=f.getCenaBezK();
		}		
		System.out.println("Ukupna vrednost svih flasa bez kaucije je: "+suma+".");
		
		System.out.println(flase.get(1));
		
		float sumaK=0;
		for(Flasa f:flase) {
			if(f instanceof StaklenaFlasa )
				sumaK+=((StaklenaFlasa) f).getCenaSaK();
			if(f instanceof PlasticnaFlasa)
				sumaK+=((PlasticnaFlasa) f).getCenaSaK();
		}
		System.out.println("Ukupna vrednost svih flasa koje imaju kauciju, sa kaucijom je: "+sumaK+".");
	}
}
