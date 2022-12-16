package ma.education.tp1.introduction;

public class TestHeritage {

    public static void main(String[] args) {

        Salle s1=new SalleCours(1L, "Salle 1", (byte) 20);
        SalleCours s2= new SalleCours(2L, "Salle 2", (byte) 20);

        // Q6 : cette ligne donne un error, car s3 et declarer de type SalleCours et on a affecter a s3, s1 de type Salle
        SalleCours s3= (SalleCours) s1;
        // Q7 : cast explicite est valide
        SalleCours s4=s2;
        System.out.print(s3.id +" " +s3.nom + " " + s3.nbPlaces);

        Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
//      Q9 : impossible de converte de byte a int
        SalleCours s6= new SalleCours(2L, "Salle 2", (byte) 20);
        SalleCours s7= (SalleCours) s5;
       SalleCours s8=s6;

        //Q10 : type sallecours peut pas convertir a type laboratoire, car il n'ya pas un lien des heritages entre sallecours et laboratoire

    }
}
