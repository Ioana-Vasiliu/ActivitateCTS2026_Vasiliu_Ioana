package simple_factory1.factory;

import simple_factory1.classes.Bicicleta;
import simple_factory1.classes.Masina;
import simple_factory1.classes.Scuter;
import simple_factory1.classes.VehiculLivrare;

public class VehiculLivrareFactory {
    public VehiculLivrare getVehiculLivrare (TipVehicul tipVehicul, String codVehicul, String zonaOperare, int capacitateKg, int autonomieKm ){
        if(tipVehicul == TipVehicul.BICICLETA){
            return new Bicicleta(codVehicul,zonaOperare,capacitateKg,autonomieKm);
        }
        if(tipVehicul==TipVehicul.MASINA){
            return new Masina(codVehicul,zonaOperare,capacitateKg,autonomieKm);
        }
        if(tipVehicul==TipVehicul.SCUTER){
            return new Scuter(codVehicul,zonaOperare,capacitateKg,autonomieKm);
        }
        return null;
    }
}
