package ma.education.tp1.introduction;

public class Salle {
    /*Salle attributes*/
      protected long id;
      protected String nom;

      /*Salle default constructor*/
    public Salle() {

    }

    /*Salle constructor with 1 parameter*/
    public Salle(String nom) {
        this.nom = nom;
    }

    /*Salle constructor with 2 parameter*/
    public Salle(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    /**/
    public static boolean equals(Salle obj1, Salle obj2) {
        return obj1.id == obj2.id;
    }
}
