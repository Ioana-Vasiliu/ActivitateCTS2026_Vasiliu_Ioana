package ExercitiiAdapter.STB.classes;

public class AbonamentSubteran {
    private int nrLuni;
    private double pret;

    public AbonamentSubteran(int nrLuni, double pret) {
        this.nrLuni = nrLuni;
        this.pret = pret;
    }

    public int getNrLuni() {
        return nrLuni;
    }

    public double getPret() {
        return pret;
    }

    public void genereazaAbonamentSubteran(){
        System.out.println("Abonamentul subterant este pe  : " + nrLuni + " luni, si costa : " + pret + " lei");
    }
}
