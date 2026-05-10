package ExercitiiAdapter.STB.classes;

public class AbonamentTerestru {
    private String tip;
    private double pret;

    public AbonamentTerestru(String tip, double pret) {
        this.tip = tip;
        this.pret = pret;
    }

    public String getTip() {
        return tip;
    }

    public double getPret() {
        return pret;
    }

    public void genereazaAbonamentTerestru(){
        System.out.println("Abonamentul este de tip : " + tip + " si costa : " + pret +  " lei");
    }

}
