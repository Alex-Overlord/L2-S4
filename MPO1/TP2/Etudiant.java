package TP2;

public class Etudiant {

    // Attribus
    private String nom;
    private final int dateNaiss;
    private int codeIns;
    private CodePays codePays;
    private float n1;
    private float n2;
    private float n3;

    // Accesseurs
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public int getDateNaiss() { return dateNaiss; }
    public CodePays getCodePays() { return codePays; }
    public float getN1() { return n1; }
    public float getN2() { return n2; }
    public float getN3() { return n3; }
    public void setN1(float n1) { this.n1 = n1; }
    public void setN2(float n2) { this.n2 = n2; }
    public void setN3(float n3) { this.n3 = n3; }
    
    
    // Constructeur
    //public Etudiant(String nom) { this.nom = nom; }
    public Etudiant(String nom, int dateNaiss, int cadeIns, CodePays codePays) {
	this.nom = nom;
	this.dateNaiss = dateNaiss;
	this.codeIns = codeIns;
    }

    // Autres méthodes
    public int getAge() { return 2019 - dateNaiss; }
    public String toString() { return nom; }
    public float moyenne() {
	return (n1 + n2 + n3) / 3; 
    }
    public Mention mention() {
	float moy = moyenne();

	if (moy >= 16) { return Mention.tb; }
	else if (moy >= 14) { return Mention.b; }
	else if (moy >= 12) { return Mention.ab; }
	else if (moy >= 10) { return Mention.passable; }
	else { return Mention.aucune; }
    }
    public String ligneResultats() {
	return getNom()+" a eu "+moyenne()+" de moyenne et "+mention()+" comme mention.";
    }
    
}
