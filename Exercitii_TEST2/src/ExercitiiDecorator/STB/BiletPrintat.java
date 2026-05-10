package ExercitiiDecorator.STB;

public class BiletPrintat extends DecoratorBilet{
    public BiletPrintat(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
        System.out.println("La multi ani!");
    }
}
