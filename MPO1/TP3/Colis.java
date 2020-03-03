package TP3;

public class Colis extends ObjetPostal {
	// Attribus
	private String decContenu;
	private float valeurDeclaree;
	private static float tarifBase = 2.0f;
	public static final String type = "Colis";

	// Constructeurs
	public Colis() {}
	public Colis(String origine, String destination, int codePostal, float poids,
					float volume, TauxRecommandation tauxRecommandation, 
					String decContenu, float valeurDeclaree) {
		super(origine, destination, codePostal, poids, volume, tauxRecommandation);
		this.decContenu = decContenu;
		this.valeurDeclaree = valeurDeclaree;
	}

	// Accesseurs en lecture
	public String getDecContenu() { return decContenu; }
	public float getValeurDeclaree() { return valeurDeclaree; }
	public float getTarifBase() { return tarifBase; }
	public String getType() { return type; }

	// Accesseurs en écriture
	public void setDecContenu(String decContenu) { this.decContenu = decContenu; }
	public void setValeurDeclaree(float valeurDeclaree) { this.valeurDeclaree = valeurDeclaree; }

	// Autres méthodes
	public float tarifAffranchissement() {
		float result = super.tarifAffranchissement();
		result += getTarifBase();
		if (getVolume() > 1.0f / 8.0f) {
			result += 3.0f;
		}
		return result;
	}
	public float tarifRemboursement() {
		float result; 
		if (getTauxRecommandation() == TauxRecommandation.zero) {
			result = 0.0f;
		}
		else if (getTauxRecommandation() == TauxRecommandation.un) {
			result = getValeurDeclaree() * 0.10f;
		}
		else {
			result = getValeurDeclaree() * 0.50f;
		}
		return result;
	}
	public String toString() {
		return super.toString() +"/"+ this.getVolume() +"/"+ this.getValeurDeclaree();
	}
}
