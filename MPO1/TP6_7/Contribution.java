package TP6_7;

import java.util.ArrayList;

import TP6_7.NatureContribution;
import TP6_7.NoticeBiblio;

public class Contribution {
    // Attributs
    private NoticeBiblio notice;
    private Contributeur contributeur;
    private NatureContribution nature;

    //public Contributeur Constribution() { return this(i) }

    // Constructeurs
    public Contribution(NoticeBiblio notice, Contributeur contributeur) {
        this.notice = notice;
        this.contributeur = contributeur;
    }
    public Contribution(NoticeBiblio notice, Contributeur contributeur, ArrayList<NatureContribution> nature) {
        this(notice, contributeur);
        this.nature = nature;
    }

    // Accesseurs en lecture
    public NoticeBiblio getNoticeBiblio() { return notice;}
    public Contributeur getContributeur() { return contributeur; }
    public ArrayList<NatureContribution> getNature() { return nature; } 

    // Accesseurs en écriture
    public void setNotice(NoticeBiblio notice) {
        this.notice = notice;
    }
    public void setContributeur(Contributeur contributeur) { 
       this.contributeur = contributeur; 
    }

    // Autres méthodes
}