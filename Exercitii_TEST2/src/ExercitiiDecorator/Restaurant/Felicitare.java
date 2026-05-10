package ExercitiiDecorator.Restaurant;

public class Felicitare extends DecoratorNota{
    public Felicitare(INotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaNota() {
        notaPlata.printeazaNota();
        System.out.println("La Multi ani!");
    }
}
