package MesPremiereClasses;

public class Rectangle
{
    private int longueur;
    private int largeur;
    private int aire;
    private int perimetre;
    private static final int nbrCotes = 4;
    private String couleur;
    private static final int angleEntreDeuxCotes = 90;
    private int x;
    private int y;

    public Rectangle (int longueur, int largeur, String couleur, int x, int y)
    {
	this.longueur = longueur;
	this.largeur = largeur;
	this.couleur = couleur;
	aire = longueur * largeur;
	perimetre = (2 * longueur) + (2 * largeur);
    }
}
