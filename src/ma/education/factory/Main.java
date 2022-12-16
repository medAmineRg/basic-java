package ma.education.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write the vitesse ?");
        int vitesse = sc.nextInt();
        VoitureFactory factory = new VoitureFactory();
        Voiture voiture = factory.makeCar(vitesse);
        voiture.accelerer();
    }
}
