package factorymethod.service.factory;

import factorymethod.service.classes.IComponenta;
import factorymethod.service.classes.TipComponenta;
import factorymethod.service.classes.Usa;

public class UsaFactory implements IComponentaFactory {
    @Override
    public IComponenta getComponenta(TipComponenta tip, String culoareComponenta, String tipMaterial, boolean esteDetasabila) {
        if (tip == TipComponenta.USA) {
            return new Usa(culoareComponenta, tipMaterial, esteDetasabila);
        }
        throw new UnsupportedOperationException("Componenta nu coincide!");

    }
}
