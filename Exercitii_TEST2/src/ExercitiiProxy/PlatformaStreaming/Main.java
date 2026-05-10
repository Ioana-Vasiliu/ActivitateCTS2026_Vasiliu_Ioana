package ExercitiiProxy.PlatformaStreaming;

public class Main {
    public static void main(String[] args) {
        Film f1 = new Film("Film 1",false);
        IFilm proxy = new ProxyFilm(f1);
        proxy.redaFilm();

    }
}
