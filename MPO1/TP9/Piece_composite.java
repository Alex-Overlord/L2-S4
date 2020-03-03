package TP9;

import java.util.ArrayList;

public abstract class Piece_composite extends Piece 
{
	// Attributs
	private int dureeMontage;
	private ArrayList<Piece> composants = new ArrayList<Piece>();

	// Accesseurs
	public ArrayList<Piece> getComposants() 
	{ 
		return composants; 
	}

	public void setComposants(ArrayList<Piece> value) 
	{ 
		this.composants = value; 
	}

	public float getPrix() 
	{  
		float result = 0;
		for (Piece p : composants)
		{
			result += p.getPrix();
		}
		return result;
	}

	// retourne le min des garanties des composants
	public float getGarantie()
	{  
		// float result = composants[0].getGarantie();
		// for (Piece p : composants)
		// {
		// 	if (result > composants[p].getGarantie())
		// 	{
		// 		result = composants[p].getGarantie();
		// 	}
		// }
		// return result;
		return 0;
	}

	// retourne le max des durees de fabrication des composants
	public int getDureeFab() 
	{  
		// int result = 0;
		// for (Piece p : composants)
		// {
		// 	if (result < composants[p].getDureeFab())
		// 	{
		// 		result = composants[p].getDureeFab();
		// 	}
		// }
		// return result;
		return 0;
	}	

	public void ajoutComposant(Piece p) 
	{  
		composants.add(p);
	}	

	public int getDureeMontage() 
	{ 
		return dureeMontage; 
	}
}