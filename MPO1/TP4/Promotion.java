package TP4;
import java.util.ArrayList;

public class Promotion
{
    private ArrayList<Etudiant> etudiants; // Association avec la classe Etudiant

    // Attributs
    private int annee;
    
    // Accesseurs
    public int getAnnee() { return annee; }
    public void setAnnee(int annee) { this.annee = annee; }

    // Constructeurs
    public Promotion()
    {
    	etudiants = new ArrayList<>();
    }
    public Promotion(int annee)
    {
    	etudiants = new ArrayList<>();
    	setAnnee(annee);
    }

    // Autres méthodes
    public Etudiant ieme(int i)
    {
    	return etudiants.get(i);
    }
    public int effectif()
    {
    	return etudiants.size();
    }
    public void inscrire(Etudiant e)
    {
	etudiants.add(e);
    }
    public float moyenneGenerale()
    {
	float result = 0;

	for (int i=0 ; i<effectif() ; i++)
	    {
		result += ieme(i).moyenne();
	    }

	return result / effectif();
    }
    public String afficheResultats()
    {
	String result = "";

	for (int i=0 ; i<effectif() ; i++)
	    {
		result += ieme(i).ligneResultats()+"\n";
	    }

	return result;
    }
    public Etudiant recherche(String nom)
    {
	for (int i=0 ; i<effectif() ; i++)
	    {
		if (ieme(i).getNom() == nom)
		    return ieme(i);
	    }

	return null;
    }
    public ArrayList<Etudiant> admis()
    {
	ArrayList<Etudiant> etudiantsAdmis = new ArrayList<>();

	for (int i=0 ; i<effectif() ; i++)
	    {
		if (ieme(i).moyenne() >= 10)
		    etudiantsAdmis.add(ieme(i));
	    }

	return etudiantsAdmis;
    }

    public ArrayList<Etudiant> nouveauxInscritsNF()
    {
	ArrayList<Etudiant> etudiantsNF = new ArrayList<>();

	for (int i=0 ; i<effectif() ; i++)
	    {
		if (ieme(i).getCodePays() == CodePays.etrangerNonFrancophone)
		    etudiantsNF.add(ieme(i));
	    }

	return etudiantsNF;
    }

    public ArrayList<Etudiant> majors()
    {
	ArrayList<Etudiant> etudiantsMajors = new ArrayList<>();
	float noteMax = 0;
	
	for (int i=0 ; i<effectif() ; i++)
	    {
		if (ieme(i).moyenne() >= noteMax)
		    noteMax = ieme(i).moyenne();
	    }

	for (int i=0 ; i<effectif() ; i++)
	    {
		if (ieme(i).moyenne() == noteMax)
		    etudiantsMajors.add(ieme(i));   
	    }
	
	return etudiantsMajors;
    }
}
