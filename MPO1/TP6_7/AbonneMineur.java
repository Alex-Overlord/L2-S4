package TP6_7;

public class AbonneMineur extends Abonne {

    // Constructeurs
    public AbonneMineur(String n, String p) {
        super(n, p);
    }

    // Autres méthodes
    public boolean peutEmprunter(Exemplaire e) {
        return super.peutEmprunter(e) 
            && (e.getNotice().getCible() == Public.enfant) 
            || (e.getNotice().getCible() == Public.jeune);
    }
    
}