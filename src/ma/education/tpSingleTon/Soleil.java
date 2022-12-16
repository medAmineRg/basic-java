package ma.education.tpSingleTon;

public class Soleil {
    private static Soleil soleil;
    public double surface;

    private Soleil(double surface){
        this.surface=surface;
    }

    public static Soleil getSoleil (double surface){
        if(soleil==null) soleil = new Soleil(surface);
        return soleil;
    }
}
