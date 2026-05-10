package ExercitiiStrategy.Livrari;

public class Comanda {
    private double valoareComanda;
    private IStrategieLivrare strategieLivrare;

    public Comanda(double valoareComanda) {
        this.valoareComanda = valoareComanda;
    }

    public void setStrategieLivrare(IStrategieLivrare strategieLivrare) {
        this.strategieLivrare = strategieLivrare;
    }

    public void seteazaLivrare(){
        double cost = strategieLivrare.calculeazaCost(valoareComanda);
        System.out.println("Costul livrarii este: " + cost + " lei");
    }

}
