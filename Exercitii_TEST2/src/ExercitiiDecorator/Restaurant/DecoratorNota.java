package ExercitiiDecorator.Restaurant;

public abstract class DecoratorNota implements INotaPlata{
    protected INotaPlata notaPlata;

    public DecoratorNota(INotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }
}
