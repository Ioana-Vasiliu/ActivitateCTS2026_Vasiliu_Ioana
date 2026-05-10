package ExercitiiStrategy.Restaurant;

public class PlataCard implements IMetodaPlata{
    private double suma;

    public PlataCard(double suma) {
        this.suma = suma;
    }

    @Override
    public void plateste() {
        System.out.println("S-a efectuat plata card cu suma: " + suma);
    }
}
