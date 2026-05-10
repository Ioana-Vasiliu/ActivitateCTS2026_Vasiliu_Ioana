package ExercitiiDecorator.SalaFitness;

public class AntrenorPersonal extends DecoratorAbonament{
    public AntrenorPersonal(IAbonament abonament) {
        super(abonament);
    }

    @Override
    public String getDescriere() {
        return abonament.getDescriere() + " doreste antrenor personal.";
    }

    @Override
    public double getPret() {
        return abonament.getPret() + 100;
    }
}
