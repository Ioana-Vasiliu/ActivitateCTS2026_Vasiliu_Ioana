package ExercitiiDecorator.SalaFitness;

public class AccesPiscina extends DecoratorAbonament{
    public AccesPiscina(IAbonament abonament) {
        super(abonament);
    }

    @Override
    public String getDescriere() {
        return abonament.getDescriere() + " doreste acces piscina.";
    }

    @Override
    public double getPret() {
        return abonament.getPret() + 20;
    }
}
