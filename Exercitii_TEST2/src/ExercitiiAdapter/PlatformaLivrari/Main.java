package ExercitiiAdapter.PlatformaLivrari;

public class Main {
    public static void livrareComandaClient(IComandaLivrare livrare){
        livrare.proceseazaLivrare();
    }

    public static void main(String[] args) {
        LivrareInterna l1 = new LivrareInterna("Marian",580);
        LivrareExterna l2 = new LivrareExterna("Bucuresti Sector 6",200);

        livrareComandaClient(l1);
        AdapterLivrare a1 = new AdapterLivrare(l2);
        livrareComandaClient(a1);
    }
}
