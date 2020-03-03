package TP2;

public class TestEtudiant {
    public static void main(String[] args) {
	Etudiant e1 = new Etudiant("Martine", 2001, 1, CodePays.francais);
	System.out.println(e1.ligneResultats());

	e1.setN1(14);
	e1.setN2(8);
	e1.setN3(10);
	System.out.println(e1.ligneResultats());	

	System.out.println("L'etudiant a "+e1.getAge()+" ans.");

	System.out.println(e1.toString());
    }
}
