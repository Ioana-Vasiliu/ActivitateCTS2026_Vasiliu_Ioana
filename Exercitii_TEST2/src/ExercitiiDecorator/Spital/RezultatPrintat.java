package ExercitiiDecorator.Spital;

public class RezultatPrintat implements IRezultat{
    private String numePacient;

    public RezultatPrintat(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void puneLaDispozitieRezultat() {
        System.out.println("Rezultatul pacientului " + numePacient + " a fost pus la dispozitie in format printat.");

    }
}
