package ExercitiiStrategy.Restaurant;

public class NotaDePlata {
    private IMetodaPlata metodaPlata;

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void achitaNota(){
        metodaPlata.plateste();
    }

}
