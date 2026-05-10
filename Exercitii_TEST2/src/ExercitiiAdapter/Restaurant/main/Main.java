package ExercitiiAdapter.Restaurant.main;

import ExercitiiAdapter.Restaurant.classes.Adapter;
import ExercitiiAdapter.Restaurant.classes.FacturaBucatarie;
import ExercitiiAdapter.Restaurant.classes.LucruBar;

public class Main {
    public static void printeazaFacturaRestaurant(FacturaBucatarie facturaBucatarie){
        facturaBucatarie.printeazaFactura();
    }

    public static void main(String[] args) {
        FacturaBucatarie f1 = new FacturaBucatarie("Pizza",45);
        LucruBar l1 = new LucruBar("Latte",20);

        printeazaFacturaRestaurant(f1);

        Adapter adapteBar = new Adapter(l1);
        printeazaFacturaRestaurant(adapteBar);
    }
}
