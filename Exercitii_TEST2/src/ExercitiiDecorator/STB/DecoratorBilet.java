package ExercitiiDecorator.STB;

public abstract class DecoratorBilet implements IBilet{
    protected IBilet bilet;

    public DecoratorBilet(IBilet bilet) {
        this.bilet = bilet;
    }

}
