package factorymethod.masina.classes;

import java.util.List;

public class SEDAN extends AMasina{

    public SEDAN(String marca, String sasiu, List<String> listaMesaje) {
        this.marca = marca;
        this.sasiu = sasiu;
        this.listaMesaje = listaMesaje;
    }

    @Override
    public void addMesaj(String mesaj) {
        this.listaMesaje.add("Constatare pentru SEDAN: " + this.marca + ", " + this.sasiu + mesaj);

    }
}
