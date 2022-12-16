package ma.education.tp4.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Terre t1= Terre.getInstance(1000, 2000);
        Terre t2= Terre.getInstance(4000, 5000);
        System.out.println(t1.distanceToSoleil);
        System.out.println(t2.distanceToSoleil);
        /*
        * g) la valeur t1.distanceToSoleil egual t2.distanceToSoleil alors on concluse que une seul object eté crerer dans la memoire.
        * */
    }
}
