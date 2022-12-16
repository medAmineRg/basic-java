package ma.education.cigma.explamba;

public class TestExpLamba {
    public static void main(String[] args) {

        //ICalcul i1 = new ICalcul();
        ICalcul i2 = new ICalcul() {
            @Override
            public double add(int a, int b) {
                return a+b;
            }
        };
        ICalcul i3 = (a, b) -> a * b ;
        System.out.println(i2.add(1,2));
        System.out.println(i3.add(5,2));

    }
}
