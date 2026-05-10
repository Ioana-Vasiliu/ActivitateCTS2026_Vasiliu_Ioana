package ExercitiiAdapter.Restaurant.classes;

public class LucruBar {
    private String bautura;
    private double pret;

    public LucruBar(String bautura, double pret) {
        this.bautura = bautura;
        this.pret = pret;
    }

    public String getBautura() {
        return bautura;
    }

    public double getPret() {
        return pret;
    }

    public void printeazaBonBar(){
        System.out.println("Bonul contine bautura : " + this.bautura + " si are pretul " + this.pret + " lei");
    }
}
