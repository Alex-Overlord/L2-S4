package TP6_7;

public class Personne {
    // Attributs
    private String nom;
    private String prenom;

    // Constructeurs
    public Personne(){}
    public Personne(String nom, String prenom){
        setNom(nom);
        setPrenom(prenom);
    }

    // Accesseurs en lecture
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }

    // Accesseurs en écriture
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    // Autres méthodes
}