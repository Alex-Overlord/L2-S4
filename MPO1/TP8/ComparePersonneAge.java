package TP8;

import java.util.Comparator;

public class ComparePersonneAge implements Comparator<Personne> 
{
    public int compare(Personne p1, Personne p2)
    {
        return p1.getAge() - p2.getAge();
    }
}