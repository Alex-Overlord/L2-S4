package TP3;

public class Lettre extends ObjetPostal {
	// Attribus
  	private boolean urgent;
  	private static float tarifBase = 0.5f;
  	private static final String type = "Lettre";

	// Constructeur
	public Lettre() {}
	public Lettre(String origine, String destination, int codePostal, float poids,
					float volume, TauxRecommandation tauxRecommandation, boolean urgent) {
		super(origine, destination, codePostal, poids, volume, tauxRecommandation);
		this.urgent = urgent;
	}

  	// Accesseurs en lecture
  	public boolean getUrgent() { return urgent; }
  	public float getTarifBase() { return tarifBase; }
  	public String getType() { return type; }

  	// Accesseurs en écriture
  	public void setUrgent(boolean u) { urgent = u; }

  	// Méthodes
  	public float tarifAffranchissement() {
		float result = super.tarifAffranchissement();
		if (urgent) {
			result += 0.3f;
		}
		return result;
	}
	
  	public float tarifRemboursement() {
		float result;
		if (getTauxRecommandation() == TauxRecommandation.zero) {
			result = 0.0f;
		}
		else if (getTauxRecommandation() == TauxRecommandation.un) {
			result = 1.5f;
		}
		else {
			result = 15.0f;
		}
		return result;
	}

  	public String toString() {
		String result = super.toString();
		if (urgent) {
			result += "/urgent";
		}
		else {
			result += "/ordinaire";
		}
		return result;
  	}
}