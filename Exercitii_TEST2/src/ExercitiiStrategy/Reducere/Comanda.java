package ExercitiiStrategy.Reducere;

public class Comanda {
    private IStrategyReducere strategyReducere;


    public void setStrategyReducere(IStrategyReducere strategyReducere) {
        this.strategyReducere = strategyReducere;
    }

    public void aplicaReducere(){
        strategyReducere.aplicaReducere();
    }

}
