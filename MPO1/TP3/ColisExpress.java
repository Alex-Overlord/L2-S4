package TP3;
import java.util.Date;

public class ColisExpress extends Colis {
  // Attributs
  private Date dateEnvoi;
  private final int numeroSuivi;
  private boolean emballage; 
  private static int numeroCourant = 0;
  private static float tarifEmballage = 3.0f;
  private static float tarifBase = 30.0f;

  // Constructeurs
  public ColisExpress() {
    this.numeroSuivi = ColisExpress.numeroCourant;
    ColisExpress.numeroCourant++;
  }
  public ColisExpress(String origine, String destination, int codePostal, float poids,
  float volume, TauxRecommandation tauxRecommandation, String decContenu, 
  float valeurDeclaree, Date dateEnvoi, boolean emballage) {
    super(origine, destination, codePostal, poids, volume, tauxRecommandation, 
    decContenu, valeurDeclaree);
    this.dateEnvoi = dateEnvoi;
    this.emballage = emballage;
    this.numeroSuivi = ColisExpress.numeroCourant;
    ColisExpress.numeroCourant++;    
  }

  // Accesseurs en lecture
  public Date getDateEnvoi() { return dateEnvoi; }
  public int getNumeroSuivi() { return numeroSuivi; }
  public boolean isEmballage() { return emballage; }
  public static int getNumeroCourant() { return numeroCourant; }
  public static float getTarifEmballage() { return tarifEmballage; }
  public float getTarifBase() { return ColisExpress.tarifBase; }

  // Accesseurs en écriture
  public void setDateEnvoi(Date dateEnvoi) { this.dateEnvoi = dateEnvoi; }
  public void setEmballage(boolean emballage) { this.emballage = emballage; }
  public static void setNumeroCourant(int numeroCourant) 
  { ColisExpress.numeroCourant = numeroCourant; }
  public static void setTarifEmballage(float tarifEmballage) 
  { ColisExpress.tarifEmballage = tarifEmballage; }

  // Méthodes
  public float tarifAff() {
    float t = this.getTarifBase();
    if (this.emballage) {
      t += ColisExpress.tarifEmballage;
    }
    return t;
  }
  public String getTypeObjet() { return "ColisExpress"; }
  public String toString() {
    return super.toString() + "/" + this.getPoids() + "/" + this.numeroSuivi;
  }
  public void setPoids(float poids) {
    if (poids <= 30.0f) {
      super.setPoids(poids);
    }
    else {
      System.out.println("Le poids doit être inférieur à 30 kg !");
      super.setPoids(30.0f);
    }
  }
}