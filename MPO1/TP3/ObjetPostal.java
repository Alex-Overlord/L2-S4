package TP3;

public abstract class ObjetPostal {
	// Attribus
	private String origine;
	private String destination;
	private int codePostal;
	private float poids;
	private float volume;
	private TauxRecommandation tauxRecommandation;
	
	// Constructeurs
	public ObjetPostal() {}
	public ObjetPostal(String o, String d, int cp, float p, float v, TauxRecommandation tr) {
		this.setOrigine(o);
		this.setDestination(d);
		this.setCodePostal(cp);
		this.setPoids(p);
		this.setVolume(v);
		this.setTauxRecommandation(tr);
	}

	// Accesseurs en lecture
	public String getOrigine() { return origine; }
	public String getDestination() { return destination; }
	public int getCodePostal() { return codePostal; }
	public float getPoids() { return poids; }
	public float getVolume() { return volume; }
	public TauxRecommandation getTauxRecommandation() { return tauxRecommandation; }
	public abstract float getTarifBase();
	public abstract String getType();

	// Accesseur en écriture
	public void setOrigine(String o) { origine = o; }
	public void setDestination(String d) { destination = d; }
	public void setCodePostal(int cp) { codePostal = cp; }
	public void setPoids(float p) { poids = p; }
	public void setVolume(float v) { volume = v; }
	public void setTauxRecommandation(TauxRecommandation tr) { tauxRecommandation = tr; }

	// Méthodes
	public float tarifAffranchissement() {
		float result = getTarifBase();
		if (this.getTauxRecommandation() == TauxRecommandation.un) {
			result = 0.5f;
		}
		else if (this.getTauxRecommandation() == TauxRecommandation.deux) {
			result = 1.5f;
		}
		return result;
	}

	public abstract float tarifRemboursement();

	public void affichage() {
		System.out.println(toString());
	}

	public String toString() {
		return getType()+"/"+codePostal+"/"+destination;
	}
}