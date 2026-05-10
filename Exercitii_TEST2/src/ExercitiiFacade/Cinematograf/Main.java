package ExercitiiFacade.Cinematograf;

public class Main {
    public static void main(String[] args) {
        ISistemCinema cinema = new CinemaFacade();

        cinema.pornesteSistem();
    }
}
