package factorymethod.service.factory;

import factorymethod.service.classes.Bara;
import factorymethod.service.classes.IComponenta;
import factorymethod.service.classes.TipComponenta;

public class BaraFactory implements IComponentaFactory {
    @Override
    public IComponenta getComponenta(TipComponenta tip, String culoareComponenta, String tipMaterial, boolean esteDetasabila) {
        if (tip == TipComponenta.BARA) {
            return new Bara(culoareComponenta, tipMaterial, esteDetasabila);
        }
        throw new UnsupportedOperationException("Componenta nu coincide!");
    }
}
