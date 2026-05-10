package ExercitiiAdapter.PlatformaLivrari;

public class LivrareExterna {
    private String adresa;
    private double costTransport;

    public LivrareExterna(String adresa, double costTransport) {
        this.adresa = adresa;
        this.costTransport = costTransport;
    }

    public String getAdresa() {
        return adresa;
    }

    public double getCostTransport() {
        return costTransport;
    }

    public void proceseazaLivrareExterna(){
        System.out.println("Adresa clientului: " + adresa + " costul de transport: " + costTransport);
    }
}
