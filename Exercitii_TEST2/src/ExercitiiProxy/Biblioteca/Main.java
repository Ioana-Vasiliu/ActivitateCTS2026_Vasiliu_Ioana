package ExercitiiProxy.Biblioteca;

public class Main {
    public static void main(String[] args) {
        ImprumutCarte imprumutCarte = new ImprumutCarte(16,"Herry Potter");
        IImprumutCarte proxy = new ProxyImprumut(imprumutCarte);

        proxy.imprumutaCarte();
    }
}
