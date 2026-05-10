package ExercitiiDecorator.SalaFitness;

public class AbonamentSimplu implements IAbonament{
    @Override
    public String getDescriere() {
        return "Abonament de baza";
    }

    @Override
    public double getPret() {
        return 120;
    }
}
