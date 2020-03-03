package TP6_7;

import java.util.ArrayList;

//import TP6_7.Exemplaire;

public class Abonne extends Personne {
    // Attributs
    private final int numero;
    private static int nbAbonneLiees = 0;
    private ArrayList<Exemplaire> emprunt;

    // Constructeurs
    public Abonne(String n, String p) {
        super(n, p);
        nbAbonneLiees++;
        numero = nbAbonneLiees;
    }

    // Accesseurs en lecture

    // Accesseurs en écriture

    // Autres méthodes
    public void ajoutEmprunt(Exemplaire e) {
        emprunt.add(e);
    }
    public boolean peutEmprunter(Exemplaire e) {
        return emprunt.size() < 5;
    }
}