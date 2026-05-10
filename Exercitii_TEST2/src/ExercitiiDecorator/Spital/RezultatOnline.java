package ExercitiiDecorator.Spital;

public class RezultatOnline extends DecoratorRezultat{
    public RezultatOnline(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void puneLaDispozitieRezultat() {
        rezultat.puneLaDispozitieRezultat();
        System.out.println("Rezultatul a fost pus in format online.");
    }
}
