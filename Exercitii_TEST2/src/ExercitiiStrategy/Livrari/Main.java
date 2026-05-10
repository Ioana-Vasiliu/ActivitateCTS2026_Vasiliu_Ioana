package ExercitiiStrategy.Livrari;

public class Main {
    public static void main(String[] args) {
        Comanda comanda = new Comanda(300);

        comanda.setStrategieLivrare(new LivrareInternationala());
        comanda.seteazaLivrare();

        comanda.setStrategieLivrare(new LivrareRapida());
        comanda.seteazaLivrare();
    }
}
