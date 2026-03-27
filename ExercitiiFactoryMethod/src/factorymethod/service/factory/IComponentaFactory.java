package factorymethod.service.factory;

import factorymethod.service.classes.IComponenta;
import factorymethod.service.classes.TipComponenta;

public interface IComponentaFactory {
    public IComponenta getComponenta(TipComponenta tip, String culoareComponenta, String tipMaterial, boolean esteDetasabila);

}
