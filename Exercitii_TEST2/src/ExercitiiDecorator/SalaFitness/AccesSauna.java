package ExercitiiDecorator.SalaFitness;

public class AccesSauna extends DecoratorAbonament{
    public AccesSauna(IAbonament abonament) {
        super(abonament);
    }

    @Override
    public String getDescriere() {
        return abonament.getDescriere() + " doreste acces sauna.";
    }

    @Override
    public double getPret() {
        return abonament.getPret() + 50;
    }
}
