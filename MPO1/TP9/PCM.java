package TP9;

public class PCM extends Piece_composite 
{
	// Attributs		
	private static String prefixe = "02";
	private float prixMontage;
		
	// Accesseurs
	public String getPrefixe() 
	{
		return prefixe;
	}

	public float getPrix()
	{
		return super.getPrix() + prixMontage;
	}

	public float getGarantie() 
	{
		return super.getGarantie() + 6;
	}
		
	public int getDureeFab() 
	{
		return super.getDureeFab() + getDureeMontage();
	}
}