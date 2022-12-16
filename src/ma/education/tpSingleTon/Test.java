package ma.education.tpSingleTon;

public class Test {
    public static void main(String[] args) {

        Soleil soleil = Soleil.getSoleil(1000.5);
        Soleil soleil2 = Soleil.getSoleil(2000.5);

        System.out.println(soleil.surface);
        System.out.println(soleil2.surface);

        // 9: on remarque q'un seul object etait creer dans la memoire
    }
}