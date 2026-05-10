package ExercitiiDecorator.SalaFitness;

public abstract class DecoratorAbonament implements IAbonament{
    protected IAbonament abonament;

    public DecoratorAbonament(IAbonament abonament) {
        this.abonament = abonament;
    }

}
