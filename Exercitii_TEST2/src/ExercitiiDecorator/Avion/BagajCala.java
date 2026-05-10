package ExercitiiDecorator.Avion;

public class BagajCala extends DecoratorBilet{

    public BagajCala(IBilet bilet) {
        super(bilet);
    }

    @Override
    public String getDescriere() {
        return bilet.getDescriere() + " + bagaj de cala";
    }

    @Override
    public double getPret() {
        return bilet.getPret() + 120;
    }
}
