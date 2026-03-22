package simple_factory1.main;

import simple_factory1.classes.VehiculLivrare;
import simple_factory1.factory.TipVehicul;
import simple_factory1.factory.VehiculLivrareFactory;

public class Main {
    public static void main(String[] args) {
        VehiculLivrareFactory fabrica1 = new VehiculLivrareFactory();

        VehiculLivrare bicicleta = fabrica1.getVehiculLivrare(TipVehicul.BICICLETA,"B45UIP","zona 1",56,340);
        VehiculLivrare masina = fabrica1.getVehiculLivrare(TipVehicul.MASINA,"B312WER","zona 2",789,230);

        bicicleta.afiseazaDescriere();
        masina.afiseazaDescriere();


    }
}
