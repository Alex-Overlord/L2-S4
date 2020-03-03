package question8;

import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Entrez un premier entier (numerateur) : ");
	int e1 = sc.nextInt();
	
	System.out.print("Entrez un second entier (denominateur) : ");
	int e2 = sc.nextInt();

	System.out.println(e1+" / "+e2+" = "+e1/e2);
	
	System.out.print("Entrez un premier flottant (numerateur) : ");
	float f1 = sc.nextFloat();

	System.out.print("Entrez un second flottant (denominateur) : ");
	float f2 = sc.nextFloat();

	System.out.println(f1+" / "+f2+" = "+f1/f2);
    }
}
