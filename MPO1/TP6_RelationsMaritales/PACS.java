package TP6_RelationsMaritales;

public class PACS {
    // Attributs
    private String nomTribunal;

    // Constructeurs
    public PACS(String nomTribunal) {
        this.setNomTribunal(nomTribunal);
    }

    // Accesseurs en lecture
    public String getNomTribunal() { return nomTribunal; }

    // Accesseurs en écriture
    public void setNomTribunal(String nomTribunal) {
        this.nomTribunal = nomTribunal;
    }

    // Autres méthodes
}