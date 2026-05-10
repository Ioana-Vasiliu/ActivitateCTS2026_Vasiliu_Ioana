package ExercitiiAdapter.SalaFitness;

public class AbonamentSala implements IAbonamentSala{
    private String denumire;
    private double pret;

    public AbonamentSala(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void activeazaAbonamentSala() {
        System.out.println("Abonamentul este de tip : " + denumire + " si are pretul "  + pret + " lei");
    }
}
