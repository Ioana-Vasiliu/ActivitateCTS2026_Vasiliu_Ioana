package factorymethod.spital.factory;

import factorymethod.spital.classes.*;

public class PersonalMedicalFactory implements IPersonalSpitalFactory{
    @Override
    public IPersonalSpital getPersonalSpital(TipPersonalNonMedical tipPersonalNonMedical, String nume, int varsta, float vechime) {
        throw new UnsupportedOperationException("Nu se creeaza personal non-medical!");
    }

    @Override
    public IPersonalSpital getPersonalSpital(TipPersonalMedical tipPersonalMedical, String nume, int varsta) {
        if(tipPersonalMedical == TipPersonalMedical.MEDIC){
            return new Medic(nume,varsta);
        }
        if(tipPersonalMedical == TipPersonalMedical.ASISTENT){
            return new Asistent(nume,varsta);
        }
        return null;
    }
}
