package TP4;
import java.util.ArrayList;

public class TestPromotion
{
    public static void main(String[] args)
    {
	Promotion info = new Promotion();
	Etudiant alex = new Etudiant("Canton Condes", 1993, 1, CodePays.francais);
	Etudiant ambre = new Etudiant("Lamouchi", 1998, 2, CodePays.francais);
	Etudiant melvin = new Etudiant("Bardin", 1998, 3, CodePays.etrangerNonFrancophone);
	
	info.inscrire(alex);
	info.inscrire(ambre);
	info.inscrire(melvin);
	
	System.out.println(info.ieme(0));
	System.out.println(info.ieme(1));
	System.out.println(info.ieme(2));

	alex.setNotes(15,19,14);
	ambre.setNotes(20,20,19);
	melvin.setNotes(4,17,12);

	// System.out.println(info.moyenneGenerale());
	// System.out.println(info.afficheResultats());
	// System.out.println(info.recherche("Canton Condes"));
	// System.out.println(info.admis();
	// System.out.println(info.nouveauxInscritsNF());
	System.out.println(info.majors());
    }
}
