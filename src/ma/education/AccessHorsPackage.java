package ma.education;

import ma.education.tp1.introduction.Salle;

public class AccessHorsPackage extends Salle{
    public void afficher(Salle s2){
        //System.out.println(s2.id);
        //System.out.println(s2.nom);
        System.out.println(id);
        System.out.println(nom);
    }
    public static void main(String[] args) {

        Salle s2 = new Salle("Salle B");
    }


}
