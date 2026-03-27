package factorymethod.masina.factory;

import factorymethod.masina.classes.*;

import java.util.List;

public interface IMasinaFactory {
    public AMasina getMasina(TipMasina tip, String marca, String sasiu, List<String> listaMesaje);

}
