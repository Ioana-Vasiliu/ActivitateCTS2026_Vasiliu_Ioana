package ExercitiiDecorator.Restaurant;

public class Main {
    public static void main(String[] args) {
        INotaPlata notaPlata = new NotaDePlata();
        notaPlata.printeazaNota();

        notaPlata = new Felicitare(notaPlata);
        notaPlata.printeazaNota();
    }
}
