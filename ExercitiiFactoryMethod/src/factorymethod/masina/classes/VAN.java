package factorymethod.masina.classes;

import java.util.List;

public class VAN extends AMasina{

    public VAN(String marca, String sasiu, List<String> listaMesaje) {
        this.marca = marca;
        this.sasiu = sasiu;
        this.listaMesaje = listaMesaje;
    }

    @Override
    public void addMesaj(String mesaj) {
        this.listaMesaje.add("Constatare pentru VAN: " + this.marca + ", "+this.sasiu + mesaj);

    }
}
