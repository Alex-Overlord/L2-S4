package TP8;

import java.util.ArrayList;

import java.util.Collections;

public class Test
{
    public static void main(String[] args) 
    {
        ArrayList<Personne> l = new ArrayList<Personne>();
        Personne x = new Personne("x", "x", 60);
        Personne y = new Personne("y", "y", 20);
        Personne z = new Personne("z", "z", 40);
        l.add(x);
        l.add(y);
        l.add(z);
        Personne max = Collections.max(l);
        System.out.println(max);
        Collections.sort(l);
        System.out.println(l);
        Personne vieux = Collections.max(l, new ComparePersonneAge());
        Collections.sort(l, new ComparePersonneAge());
        System.out.println(l);
    }
}