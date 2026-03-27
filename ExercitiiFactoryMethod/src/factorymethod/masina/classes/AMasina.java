package factorymethod.masina.classes;

import java.util.List;

public abstract class AMasina {
    protected String marca;
    protected String sasiu;
    protected List<String> listaMesaje;


    public abstract void addMesaj(String mesaj);
}
