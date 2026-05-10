package ExercitiiDecorator.Avion;

public class MasaLaBord extends DecoratorBilet{
    public MasaLaBord(IBilet bilet) {
        super(bilet);
    }

    @Override
    public String getDescriere() {
        return bilet.getDescriere() + " + masa la bord";
    }

    @Override
    public double getPret() {
        return bilet.getPret() + 320;
    }
}
