package ma.education.tp2.statickeyword;

public class TestStatic {

    public static void mTerreain(String [] args) {

        Etudiant e1= new Etudiant(1, "AHMED", 20);
        Etudiant e2= new Etudiant(2, "SAID", 30);

        System.out.println("Etudiant 1 : " + e1.id+ " " + e1.nom + " " + e1.nbEtudiants);
        System.out.print("Etudiant 2 : " + e2.id+ " " + e2.nom + " " + e2.nbEtudiants);

        /* 9)
            la valeur nbEtudiants est partage avec tous les instances de class Etudiant
        * */

    }
}
