package ExercitiiStrategy.Reducere;

public class Main {
    public static void main(String[] args) {
        Comanda c1 = new Comanda();

        c1.setStrategyReducere(new ReducerePensionar());
        c1.aplicaReducere();

        c1.setStrategyReducere(new ReducereStudent());
        c1.aplicaReducere();



    }
}
