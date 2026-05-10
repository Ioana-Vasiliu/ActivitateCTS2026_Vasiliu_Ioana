package ExercitiiAdapter.Restaurant.classes;

public class FacturaBucatarie {
    private String produs;
    private double pret;

    public FacturaBucatarie(String produs, double pret) {
        this.produs = produs;
        this.pret = pret;
    }

    public void printeazaFactura(){
        System.out.println("Factura contine: " + produs + " si are pretul : " + pret + " lei");
    }

    public String getProdus() {
        return produs;
    }

    public double getPret() {
        return pret;
    }
}
