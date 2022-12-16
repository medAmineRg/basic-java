package ma.education.cigma.tpabstract;

public class Cercle extends FormeGeoA{
    private Double rayon;
    @Override
    public double calculerSurface() {
        return this.rayon * this.rayon * 3.14;
    }
}
