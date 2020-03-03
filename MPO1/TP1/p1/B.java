package p1;

import p2.C;

public class B {
    
    public static void ma() {
	A a = new A();
	System.out.println(a.a1);
	// System.out.println(a.a2); // erreur car attribut private
	// System.out.println(a.a3); // erreur car attribut private
    }
  
    public static void mc() {
	C c = new C();
	System.out.println(c.c1);
	// System.out.println(c.c2);
	// System.out.println(c.c3);
    }
}
