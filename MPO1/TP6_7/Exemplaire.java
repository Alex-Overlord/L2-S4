package TP6_7;

public class Exemplaire {
    // Attributs
    private NoticeBiblio notice;
    private Abonne emprunteur;
    private boolean enReparation;

    // Constructeur (construit sans emprunteur)
    public Exemplaire() {}
    public Exemplaire(NoticeBiblio notice, Abonne emprunteur, boolean enReparation) {
        this.notice = notice;
        this.emprunteur = emprunteur;
        this.enReparation = enReparation;
    }

    // Accesseurs en lecture

    // Accesseurs en écriture

    // Autres méthodes
    public boolean estDisponible() {
        return enReparation && (emprunteur == null);
    }

    public void empruntPar(Abonne a) {
        if (estDisponible() && a.peutEmprunter(this)) {
            emprunteur = a;
            a.ajoutEmprunt(this);
        }
    }

}