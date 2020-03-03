package TP9;

public abstract class Piece 
{ 
	// Attributs
	private String nom;   
	private String suffixe;
		
	// Accesseurs
	public String getReference() 
	{  
		return getPrefixe() + suffixe;
	}

	public abstract String getPrefixe();

	public abstract float getPrix();		

	public abstract float getGarantie();		

	public abstract int getDureeFab();
}