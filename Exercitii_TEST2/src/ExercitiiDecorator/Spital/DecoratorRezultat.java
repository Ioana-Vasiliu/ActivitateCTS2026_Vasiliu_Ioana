package ExercitiiDecorator.Spital;

public abstract class DecoratorRezultat implements IRezultat{
    protected IRezultat rezultat;

    public DecoratorRezultat(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

}
