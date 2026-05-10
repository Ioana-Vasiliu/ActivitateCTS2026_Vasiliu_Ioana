package ExercitiiAdapter.SalaFitness;

public class AbonamentPiscina {
    private double pret;

    public AbonamentPiscina(double pret) {
        this.pret = pret;
    }

    public double getPret() {
        return pret;
    }
    public void generazaAbonamentPiscina(){
        System.out.println("Abonamentul la piscina are pretul de  : " + this.pret);
    }

}
