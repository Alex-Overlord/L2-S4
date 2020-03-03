package TP6_RelationsMaritales;

public class Personne {
    // Attributs
    private String nom;
    private String prenom;

    // Constructeurs
    public Personne(String nom, String prenom) {}

    // Accesseurs en lecture
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }

    // Accesseurs en écriture
    void setNom(String nom) { this.nom = nom; }
    void setPrenom(String prenom) { this.prenom = prenom; }

    // Autres méthodes
}