package ExercitiiDecorator.Avion;

public class ImbarcarePrioritara extends DecoratorBilet{
    public ImbarcarePrioritara(IBilet bilet) {
        super(bilet);
    }

    @Override
    public String getDescriere() {
        return bilet.getDescriere() + " + imbarcare prioritara";
    }

    @Override
    public double getPret() {
        return bilet.getPret() + 50;
    }
}
