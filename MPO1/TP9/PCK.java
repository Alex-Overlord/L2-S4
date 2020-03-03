package TP9;

public class PCK extends Piece_composite 
{
	// Attrituts		
	private static String prefixe = "01";
		
	// Accesseurs
	public String getPrefixeRef() 
	{
		return prefixe;
	}
		
	public float getGarantie() 
	{
		return super.getGarantie() / 2;
	}
}