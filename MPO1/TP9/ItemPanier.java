package TP9;

public class ItemPanier
{
  // Attributs
  private Piece piece;
  private int qte;

  // Constructeurs
  public ItemPanier(Piece p, int q)
  {
    piece = p;
    qte = q;
  }

  // Accesseurs
  public Piece getPiece()
  {
    return piece;
  }

  public float getQuantite() 
  {
    return qte;
  }

  // Autres méthodes
  public float getPrix()
  {
    return qte * piece.getPrix();
  }

  public void incrQte(int q)
  {
    qte += q;
  }
}