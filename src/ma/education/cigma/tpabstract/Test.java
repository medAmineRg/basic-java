package ma.education.cigma.tpabstract;

public class Test {
    public static void main(String[] args) {

        //FormGeo f1 = new FormGeo();
        //FormGeo f2 = new FormeGeoA();
        FormGeo f3 = new Cercle();
        FormGeo f4 = new FormGeo() {
            @Override
            public double calculerSurface() {
                return 10.0;
            }
        };
        //FormGeo f5 = () -> 10.0;
    }
}
