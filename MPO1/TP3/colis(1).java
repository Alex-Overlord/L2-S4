package tp3;

public class Colis extends ObjetPostal
{
    // Attribus
    private String decContenu;
    private float valeurDeclaree;
    private static float tarifBase = 2.0f;
    public static final String type = "Colis";

    // Accesseurs en lecture
    public String getDecContenu() { return decContenu; }
    public float getValeurDeclaree() { return valeurDeclaree; }
    public float getTarifBase() { return tarifBase; }
    public String getType() { return type; }

    // Accesseurs en écriture
    public void setDecContenu(String decContenu) { this-> decContenu = decContenu; }
    public void setValeurDeclaree(float valeurDeclaree) { this->valeurDeclaree = valeurDeclaree; }

    // Autres méthodes
    public float tarifAffranchissement()
    {
	float result = super.tarifAffranchissement();
	result += getTarifBase();
	if (super.getVolume() > 1/8)
	    {
		result += 3.0f;
	    }
	return result;
    }
    public float tarifRemboursement()
    {
	float result;
	if (super.getTauxRecommandation() = TauxRecommandation.zero)
	    {
		result = 0.0f
	    }
	else if (super.getTauxRecommandation() = TauxRecommandation.un)
	    {
		result = getValeurDeclaree() * 0.10f;
	    }
	else
	    {
		result = getValeurDeclaree() * 0.50f;
	    }
    }
    public String toString()
    {
	float result = super.tarifAffranchissement();
	result += super.getVolume() + getValeurDeclaree();
	return result;
    }
}
