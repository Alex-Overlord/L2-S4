package TP8;

public class FileAttenteAvecStat extends FileAttente implements IFileAttenteAvecStat
{
    private int nbE = 0;
    private int nbS = 0;

    public void entre (Personne p)
    {
        super.entre(p);
        nbE++;
    }

    public Personne sort()
    {
        Personne p = super.sort();
        if (p != null) nbS++;
        return p;
    }

    public int nbEntrees() { return nbE; }

    public int nbSorties() { return nbS; }
}