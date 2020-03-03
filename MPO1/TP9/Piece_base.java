package TP9;

public class Piece_base extends Piece 
{	
	// Attributs
	private static String prefixe = "00";
	private float prix;
	private float garantie;
	private int dureeFab;

	// Accesseurs
	public String getPrefixe() 
	{ 
		return prefixe; 
	}

	public float getPrix() 
	{ 
		return prix; 
	}

	public float getGarantie() 
	{ 
		return garantie; 
	}

	public int getDureeFab() 
	{ 
		return dureeFab; 
	}
}