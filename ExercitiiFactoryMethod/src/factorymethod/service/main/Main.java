package factorymethod.service.main;
import factorymethod.service.classes.IComponenta;
import factorymethod.service.classes.TipComponenta;
import factorymethod.service.factory.BaraFactory;
import factorymethod.service.factory.CapotaFactory;
import factorymethod.service.factory.IComponentaFactory;

public class Main {
    public static void main(String[] args) {
        IComponentaFactory fabrica =new BaraFactory();
        IComponentaFactory fabrica2 = new CapotaFactory();

        IComponenta bara = fabrica.getComponenta(TipComponenta.BARA,"albastru","plastic",true);
        System.out.println("Bara are culoarea : " + bara.getCuloareComponenta() + " si materialul : " +
                bara.tipMaterial() + " si este detasabile? " + bara.esteDetasabila());

        IComponenta capota = fabrica2.getComponenta(TipComponenta.CAPOTA,"gri","aluminiu",false);
        System.out.println("Capota are culoarea : " + capota.getCuloareComponenta() + " si materialul : " +
                capota.tipMaterial() + " si este detasabile? " + capota.esteDetasabila());


    }
}
