package ma.education.factory;

public class VoitureFactory {

    public Voiture makeCar(int v) {
        if(v < 91) {
            return new VoitureLourde();
        } else {
            return new VoitureLeger();
        }
    }
}
