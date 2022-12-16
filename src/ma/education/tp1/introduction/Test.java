package ma.education.tp1.introduction;

public class Test {



    public static void main(String[] args) {

        /*Creation of 3 objects: o1, o2, o3*/
        Salle o1 = new Salle();
        Salle o2 = new Salle("Salle Informatique");
        Salle o3 = new Salle(2, "Salle des cours");

        /*Show the value of objects : o1, o2, o3 */
        System.out.println("o1 -> id = " + o1.id);
        System.out.println("o1 -> nom = " + o1.nom);
        System.out.println("o2 -> id = " + o2.id);
        System.out.println("o2 -> nom = " + o2.nom);
        System.out.println("o3 -> id = " + o3.id);
        System.out.println("o3 -> nom = " + o3.nom);
    }
}
