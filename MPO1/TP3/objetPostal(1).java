package tp3;

public abstract class ObjetPostal
{
    // Attribus
    private String origine;
    private String destination;
    private String codePostal;
    private int poids;
    private float volume;
    private TauxRecommandation tauxRecommandation;
    
    // Accesseurs en lecture
    public String getOrigine() { return origine; }
    public String getDestination() { return destination; }
    public String getCodePostal() { return codePostal; }
    public int getPoids() { return poids; }
    public float getVolume() { return volume; }
    public TauxRecommandation getTauxRecommandation() { return tauxRecommandation; }
    public abstract float getTarifBase();
    public abstract String getType();

    // Accesseur en écriture
    public void setOrigine(String origine) { this->origine = origine; }
    public void setDestination(String destination) { this->destination = destination; }
    public void setCodePostal(String codePostal) { this->codePostal = codePostal; }
    public void setPoids(String poids) { this->poids = poids; }
    public void setVolume(String volume) { this->volume = origine; }
    public void setOrigine(String origine) { this->origine = volume; }
    
    // Autres Méthodes
    public float tarifAffranchissement()
    {
	float result = getTarifBase();
	if (getTauxRecommandation() == tauxRecommandation.un)
	    {
		result = 0.5f;
	    }
	else if (getTauxRecommandation == TauxRecommandation.deux)
	    {
		result = 1.5f;
	    }
	return result;
    }
    public abstract float tarifRemboursement();
    public void affichage()
    {
	System.out.println(toString());
    }

    public String toString()
    {
	return getType()+" "+codePostal+"/"+destination+"/";
    }

}
