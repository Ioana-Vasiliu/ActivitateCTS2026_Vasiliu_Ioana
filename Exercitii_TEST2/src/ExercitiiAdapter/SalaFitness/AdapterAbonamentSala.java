package ExercitiiAdapter.SalaFitness;

public class AdapterAbonamentSala implements IAbonamentSala{
    private AbonamentPiscina abonamentPiscina;

    public AdapterAbonamentSala(AbonamentPiscina abonamentPiscina) {
        this.abonamentPiscina = abonamentPiscina;
    }

    @Override
    public void activeazaAbonamentSala() {
        abonamentPiscina.generazaAbonamentPiscina();
    }
}
