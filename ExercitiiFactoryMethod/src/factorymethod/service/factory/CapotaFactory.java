package factorymethod.service.factory;

import factorymethod.service.classes.Capota;
import factorymethod.service.classes.IComponenta;
import factorymethod.service.classes.TipComponenta;

public class CapotaFactory implements IComponentaFactory{
    @Override
    public IComponenta getComponenta(TipComponenta tip, String culoareComponenta, String tipMaterial, boolean esteDetasabila) {
        if(tip ==TipComponenta.CAPOTA){
            return new Capota(culoareComponenta,tipMaterial,esteDetasabila);
        }
        throw new UnsupportedOperationException("Componenta nu coincide!");
    }

}
