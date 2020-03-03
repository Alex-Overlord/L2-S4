package TP8;

public interface IFileAttente {
	public void entre(Personne p); // abstract optionnel
  public Personne sort();
  public boolean estVide();
  public int taille();
  public String toString();

  public default void vider()
  {
		int taille = taille();
		for (int i=0 ; i<taille() ; i++) {
			this.sort();
		}
	}
}