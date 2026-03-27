package factorymethod.masina.factory;

import factorymethod.masina.classes.AMasina;
import factorymethod.masina.classes.TipMasina;
import factorymethod.masina.classes.VAN;

import java.util.List;

public class VANFactory implements IMasinaFactory{
    @Override
    public AMasina getMasina(TipMasina tip, String marca, String sasiu, List<String> listaMesaje) {
        if(tip == TipMasina.VAN){
            return new VAN(marca,sasiu,listaMesaje);

        }
        throw new UnsupportedOperationException("Tip masina invalid!");
    }
}
