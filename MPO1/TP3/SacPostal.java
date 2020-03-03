package TP3;
import java.util.ArrayList;

public class SacPostal {
    // Attributs
    private float capaMax;
    private ArrayList<ObjetPostal> sac;

    // Accesseurs en lecture
    public float getCapaMax() { return capaMax; }
    public ArrayList<ObjetPostal> getSac() { return sac; }

    // Accesseurs en écriture
    public void setCapaMax(float cm) { capaMax = cm; }
    public void setSac(ArrayList<ObjetPostal> s) { sac = s; }

    // Constructeurs
    public SacPostal() {
        capaMax = 0.5f;
        sac = new ArrayList<>();
    }

    public SacPostal(float cm) {
        capaMax = cm;
        sac = new ArrayList<>();
    }

    // Méthodes
    public boolean ajout(ObjetPostal op) {
        if (op.getVolume() + volumeOccupe() > capaMax) {
            return false;
        }
        else {
            sac.add(op);
            return true;
        }
    }

    public float volumeOccupe() {
        int som = 0;
        for (int i=0; i<sac.size() ; i++) {
            som += sac.get(i).getVolume();
        }
        return som;
    }

    public SacPostal extraire(int code) {
        ArrayList<ObjetPostal> sacTemp = new ArrayList<>();
        float volumeTmp = 0.0f;

        for (int i=0 ; i < sac.size() ; i++) {
            if (code == sac.get(i).getCodePostal()) {
                sacTemp.add(sac.get(i));
                volumeTmp += sac.get(i).getVolume();
            }
        }
        SacPostal sacCodePostal = new SacPostal(volumeTmp);
        sacCodePostal.setSac(sacTemp);

        return sacCodePostal;
    }
}