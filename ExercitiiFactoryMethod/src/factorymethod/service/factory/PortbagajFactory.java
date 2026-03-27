package factorymethod.service.factory;

import factorymethod.service.classes.IComponenta;
import factorymethod.service.classes.Portbagaj;
import factorymethod.service.classes.TipComponenta;

public class PortbagajFactory implements IComponentaFactory{
    @Override
    public IComponenta getComponenta(TipComponenta tip, String culoareComponenta, String tipMaterial, boolean esteDetasabila) {
        if(tip ==TipComponenta.PORTBAGAJ){
            return new Portbagaj(culoareComponenta,tipMaterial,esteDetasabila);
        }
        throw new UnsupportedOperationException("Componenta nu coincide!");

    }
}
