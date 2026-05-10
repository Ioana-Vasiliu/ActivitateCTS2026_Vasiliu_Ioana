package ExercitiiStrategy.Restaurant;

public class Main {
    public static void main(String[] args) {
        NotaDePlata nota = new NotaDePlata();

        nota.setMetodaPlata(new PlataCash(200));
        nota.achitaNota();

        nota.setMetodaPlata(new PlataCard(450));
        nota.achitaNota();
    }
}
