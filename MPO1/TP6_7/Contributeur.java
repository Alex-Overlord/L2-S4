package TP6_7;

import java.util.ArrayList;

//import TP6_7.NoticeBiblio;

public class Contributeur extends Personne {
    // Attributs
    private ArrayList<Contribution> contributions;
    //private ArrayList<NoticeBiblio> notices;

    // Constructeurs
    public Contributeur() {}
    //public Contributeur(ArrayList<Contribution> contributions, A)

    // Accesseurs en lecture

    // Accesseurs en écriture

    // Autres méthodes
    void ajoutContribution(Contibution cTion) {
        if (this == cTion.getContributeur()) {
            contributions.add(cTion);
        }
    }
}