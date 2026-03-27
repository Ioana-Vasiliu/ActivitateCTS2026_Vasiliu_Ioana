package factorymethod.masina.classes;

import java.util.List;

public class SUV extends AMasina{

    public SUV(String marca, String sasiu, List<String> listaMesaje) {
        this.marca = marca;
        this.sasiu = sasiu;
        this.listaMesaje = listaMesaje;
    }

    @Override
    public void addMesaj(String mesaj) {
        this.listaMesaje.add("Constatare pentru SUV: " + this.marca + ", "+ this.sasiu + mesaj);

    }
}
