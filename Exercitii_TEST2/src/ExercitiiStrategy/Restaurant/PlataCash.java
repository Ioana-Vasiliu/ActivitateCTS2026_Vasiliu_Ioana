package ExercitiiStrategy.Restaurant;

public class PlataCash implements IMetodaPlata{
    private double suma;

    public PlataCash(double suma) {
        this.suma = suma;
    }

    @Override
    public void plateste() {
        System.out.println("s-a efectuat plata in cash cu suma : " + suma);
    }
}
