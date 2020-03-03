package TP9;

import java.util.ArrayList;

public class Panier 
{
  // Attributs
  private ArrayList<ItemPanier> items = new ArrayList<>();
  
  // Constructeurs

  // Accesseurs

  // Autres méthodes
  public void ajoutPiece(Piece p, int qte)
  {
    ItemPanier ip = getItem(p);
    if (ip != null) // la piece existe déjà
    {
      ip.incrQte(1); // 1 = qte
    }
    else // la piece n'existe pas
    {
      ip = new ItemPanier(p, 1);
      items.add(ip);
    }
  }

  public float getPrix()
  {
    float result = 0;
    for (ItemPanier ip : items)
    {
      result += ip.getPrix();
    }
    return result;
  }

  public ItemPanier getItem(Piece p)
  {
    for (ItemPanier ip : items)
    {
      if (ip.getPiece() == p)
      {
        return ip;
      }
    }
    return null;
  }
}