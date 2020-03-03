package p2;

public class C {
    public int c1 = 1;
    private int c2 = 2;
    private static int c3 = 3;
}

/*
p1/B.java:13: error: cannot find symbol
	C c = new C();
	^
  symbol:   class C
  location: class B
p1/B.java:13: error: cannot find symbol
	C c = new C();
	          ^
  symbol:   class C
  location: class B
 */
