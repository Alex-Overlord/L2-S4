package TP3;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ObjetPostal o1; // = new ObjetPostal ... ne serait pas possible car la classe est abstraite
		o1 = new Lettre("Montpellier","pole nord",8809,0.02f,0.01f,
		TauxRecommandation.zero,true);
		System.out.println(o1); //ou o1.affiche();
	
		Colis o2 = new Colis("pole sud","Paris",75000,2.0f,3.0f,
		TauxRecommandation.deux,"photos d'iceberg",3);
		System.out.println(o2); //ou o2.affiche();
	
		// Colis o3 = new ColisExpress("pole sud","Paris","75000",2,3,TauxRecommandation.deux,
		// 	"photos d'iceberg",3,new Date(), true);
		// System.out.println(o3); //ou o3.affiche();
		
		// o3 = new ColisExpress("Argentine","Clermont","000",80,3,TauxRecom.fort,
		// 	"matÃ©",3,new Date(), true);
		// System.out.println(o3); //ou o3.affiche();	
	}
}