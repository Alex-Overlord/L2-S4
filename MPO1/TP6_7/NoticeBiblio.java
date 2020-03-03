package TP6_7;

import java.util.ArrayList;

public class NoticeBiblio {
    // Attributs
    private String titre;
    private ArrayList<String> sous_titre;
    private int isbn;
    private Public cible;
    private ArrayList<Contributeur> contributeurs;
    private ArrayList<Contribution> contributions;
    private ArrayList<Exemplaire> exemplairesReferences;

    // Constructeurs
    public NoticeBiblio() {}
    public NoticeBiblio(String titre, String sous_titre, String isbn, Public cible) {
        this.set
    }

    // Accesseurs en lecture
    public String getTitre() { return titre; }
    public ArrayList<String> getSous_titre() { return sous_titre; }
    public int getIsbn() { return isbn; }
    public Public getCible() { return cible; }
    public ArrayList<Contributeur> getContributeurs() { return contributeurs; }

    // Accesseurs en écriture
    public void setTitre(String titre) { 
        this.titre = titre; 
    }
    public void setSous_titre(ArrayList<String> sous_titre) {        
        this.sous_titre = sous_titre; 
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void setCible(Public cible) {
        this.cible = cible;
    }
    public void setContributions(ArrayList<Contribution> contributions) {
        
    }

    // Autres méthodes
    public boolean estDisponible() {
        for (Exemplaire e : exemplairesReferences) {
            if (e.estDisponible()) return true;
            return false;
        }
    }
    public void ajoutContribution(Contributeur cTeur, NatureContribution nat_cTion) {
        Contribution cTion = new Contribution(nat_cTion, this, cTeur);
        ajoutContribution(cTion);
    }
    public void ajoutContribution(Contribution cTion) {
        contributions.add(cTion);
        cTion.getContributeur().ajoutContribution(cTion);
    }

}