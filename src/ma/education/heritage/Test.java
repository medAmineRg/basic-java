package ma.education.heritage;

public class Test {
    public static void main(String[] args) {
        Personne p1 = new Etudiant();
        Personne p2 = new Professeur();
        Personne p3 = new Personne();

        /*On a declarer que e1 est de type Etudiant, mais on a instancier aver la constructor de la classe professeur*/
        //Etudiant e1 = new Professeur();

        /*On a declarer que e1 est de type Professeur, mais on a instancier aver la constructor de la classe Etudiant*/
        //Professeur p4 = new Etudiant();

        Etudiant e2 = (Etudiant) p1;
        Professeur p5 = (Professeur) p2;

        /*error car l'attribut note n'existe pas dans la class Personne*/
        //System.out.println(p1.note);

        System.out.println(e2.note);
        /*error car l'attribut salaire n'existe pas dans la class Personne*/

        //System.out.println(p2.salaire);
        System.out.println(p5.salaire);

    }
}
