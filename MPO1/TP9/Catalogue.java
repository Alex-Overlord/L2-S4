package TP9;

import java.util.HashMap;

public class Catalogue 
{
  // Attributs
  private HashMap<String, Piece> piecesReferences = new HashMap<>();

  // Constructeurs


  // Accesseurs
  public Piece getPiece(String ref)
  {
    return piecesReferences.get(ref);
  }

  // Autres méthodes
  public void ajoutPiece(Piece p)
  {
    piecesReferences.put(p.getReference(), p);
  }
}