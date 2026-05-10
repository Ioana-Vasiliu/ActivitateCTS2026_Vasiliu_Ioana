package ExercitiiDecorator.STB;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new BiletSimplu();
        bilet.printeazaBilet();

        bilet = new BiletPrintat(bilet);
        bilet.printeazaBilet();
    }
}
