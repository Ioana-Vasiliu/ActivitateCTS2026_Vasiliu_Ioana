package factorymethod.masina.main;

import factorymethod.masina.classes.AMasina;
import factorymethod.masina.classes.SUV;
import factorymethod.masina.classes.TipMasina;
import factorymethod.masina.factory.IMasinaFactory;
import factorymethod.masina.factory.SEDANFactory;
import factorymethod.masina.factory.SUVFactory;
import factorymethod.masina.factory.VANFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IMasinaFactory fabricaSUV = new SUVFactory();
        IMasinaFactory fabricaVAN = new VANFactory();
        IMasinaFactory fabricaSEDAN =new SEDANFactory();
        List<String> mesaje =new ArrayList<>();

        AMasina masina1 = fabricaSUV.getMasina(TipMasina.SUV,"BMW","XYZ123",mesaje);
        AMasina masina2 = fabricaVAN.getMasina(TipMasina.VAN,"Ford","ABC345",mesaje);
        AMasina masina3 = fabricaSEDAN.getMasina(TipMasina.SEDAN,"Mazda","789IOP",mesaje);


        masina1.addMesaj(" ,necesita schimb de ulei");
        masina2.addMesaj(" ,schimb de placute");
        masina3.addMesaj(" ,vopsire capota");

        for(String mesaj : mesaje){
            System.out.println(mesaj);
        }

    }
}
