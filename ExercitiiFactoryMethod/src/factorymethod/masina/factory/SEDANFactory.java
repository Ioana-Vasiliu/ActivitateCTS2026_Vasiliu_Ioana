package factorymethod.masina.factory;

import factorymethod.masina.classes.*;

import java.util.List;

public class SEDANFactory implements IMasinaFactory{
    @Override
    public AMasina getMasina(TipMasina tip, String marca, String sasiu, List<String> listaMesaje) {
        {
            if(tip == TipMasina.SEDAN){
                return new SEDAN(marca,sasiu,listaMesaje);

            }
            throw new UnsupportedOperationException("Tip masina invalid!");
        }
    }
}
