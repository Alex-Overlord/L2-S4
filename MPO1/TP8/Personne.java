package TP8;

public class Personne implements Comparable<Personne>
{
    // Attributs
    private String prenom;
    private String nom;
    private int age;

    // Constructeurs
    public Personne(String prenom, String nom, int age)
    {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    // Accesseurs en lecture
    public String getPrenom() { return prenom; }
    public String getNom() { return nom; }
    public int getAge() { return age; }

    // Accesseurs en écriture
    void setPrenom(String prenom) { this.prenom = prenom; }
    void setNom(String nom) { this.nom = nom; }
    void setAge(int age) { this.age = age; }

    // Autres méthodes
    public int compareTo(Personne p)
    {
        return getNom().compareTo(p.getNom());
    }

    public String toString() 
    {
        return getPrenom()+" "+getNom();
    }
}