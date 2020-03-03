package TP6_RelationsMaritales;

import java.time.LocalDate;

public abstract class ContratVieCommune {
    // Attributs
    private LocalDate debut;
    private LocalDate fin;
    private ArrayList<Personne>(2) conjoints;

    // Constructeurs
    public ContratVieCommune(LocalDate debut, LocalDate fin) {

    }

    // Accesseurs en lecture
    public LocalDate getDebut() { return debut; }
    public LocalDate getFin() { return fin; }

    // Accesseurs en écriture
    public void setDebut() { this.debut = debut; }
    public void setFin() { this.fin = fin; }

    // Autres méthodes
}