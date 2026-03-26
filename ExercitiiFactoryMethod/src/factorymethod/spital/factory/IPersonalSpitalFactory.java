package factorymethod.spital.factory;

import factorymethod.spital.classes.IPersonalSpital;
import factorymethod.spital.classes.TipPersonalMedical;
import factorymethod.spital.classes.TipPersonalNonMedical;

public interface IPersonalSpitalFactory {
    IPersonalSpital getPersonalSpital(TipPersonalNonMedical tipPersonalNonMedical, String nume, int varsta, float vechime);

    IPersonalSpital getPersonalSpital(TipPersonalMedical tipPersonalMedical,String nume, int varsta);
}
