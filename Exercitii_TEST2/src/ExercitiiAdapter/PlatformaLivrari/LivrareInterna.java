package ExercitiiAdapter.PlatformaLivrari;

public class LivrareInterna implements IComandaLivrare{
    private String numeClient;
    private double pret;

    public LivrareInterna(String numeClient, double pret) {
        this.numeClient = numeClient;
        this.pret = pret;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void proceseazaLivrare() {
        System.out.println("Comanda pentru : " + numeClient + " cu pretul : " + pret);
    }
}
