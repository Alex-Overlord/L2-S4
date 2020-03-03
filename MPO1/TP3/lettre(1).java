package tp3;

public class Lettre extends ObjetPostal
{
    // Attribus
    private bool urgent;
    private static float tarifBase = 0.5f;
    private static final String type = "Lettre";

    // Accesseurs en lecture
    public bool getUrgent() { return urgent; }
    public float getTarifBase() { return tarifBase; }
    public String getType() { return type; }

    // Accesseurs en écriture
    public void setUrgent(bool urgent) { this->urgent = urgent; }

    // Autres méthodes
    public float tarifAffranchissement()
    {
	float result = super.tarifAffranchissement();
	if (urgent)
	    {
		result += 0.3f;
	    }
	return result;
    }
    public float tarifRemboursement()
    {
	float result;
	if (super.getTauxRecommandation() == TauxRecommandation.zero)
	    {
		result = 0.0f;
	    }
	else if (super.getTauxRecommandation() == TauxRecommandation.un)
	    {
		result = 1.5f;
	    }
	else
	    {
		result = 15.0f
	    }
	return result;
    }
    public String toString()
    {
	String result = super.toString();
	if (urgent)
	    {
		result += "urgent";
	    }
	else
	    {
		result += "ordinaire";
	    }
    }

}
