package factorymethod.masina.factory;

import factorymethod.masina.classes.AMasina;
import factorymethod.masina.classes.SUV;
import factorymethod.masina.classes.TipMasina;

import java.util.List;

public class SUVFactory implements IMasinaFactory{
    @Override
    public AMasina getMasina(TipMasina tip, String marca, String sasiu, List<String> listaMesaje) {
        if(tip == TipMasina.SUV){
            return new SUV(marca,sasiu,listaMesaje);

        }
        throw new UnsupportedOperationException("Tip masina invalid!");
    }
}
