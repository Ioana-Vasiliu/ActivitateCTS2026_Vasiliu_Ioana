package factorymethod.spital.factory;

import factorymethod.spital.classes.*;

public class PersonalNonMedicalFactory implements IPersonalSpitalFactory{
    @Override
    public IPersonalSpital getPersonalSpital(TipPersonalNonMedical tipPersonalNonMedical, String nume, int varsta, float vechime) {
       if (tipPersonalNonMedical == TipPersonalNonMedical.BRACADIER){
           return new Bracadier(nume,varsta,vechime);
       }
       if(tipPersonalNonMedical == TipPersonalNonMedical.REGISTRATOR){
           return new Registrator(nume,varsta,vechime);
       }
       if(tipPersonalNonMedical == TipPersonalNonMedical.SECRETAR){
           return new Secretar(nume,varsta,vechime);
       }
       return null;
    }

    @Override
    public IPersonalSpital getPersonalSpital(TipPersonalMedical tipPersonalMedical, String nume, int varsta) {
        throw  new UnsupportedOperationException("Nu se creeaza personal medical!");
    }
}
