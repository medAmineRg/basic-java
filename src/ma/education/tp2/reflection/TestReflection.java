package ma.education.tp2.reflection;
import ma.education.tp1.introduction.Salle;
import java.lang.reflect.*;

import java.util.Arrays;
import java.util.Objects;

public class TestReflection {



     public static void main(String[] args) {
         Method[] m= Salle.class.getDeclaredMethods();
         for (int i = 0 ; i < m.length ; i++){
             System.out.println("method "+ i + " " + m[i]);
         }
         Salle o1 = new Salle();
         Salle o2 = new Salle("Salle Informatique");
         Salle o3 = new Salle(2, "Salle des cours");

         boolean checkForEquality = Objects.equals(o2,o3);
         System.out.println("Is o2 equal o3 : " + checkForEquality);
         
     }
}
