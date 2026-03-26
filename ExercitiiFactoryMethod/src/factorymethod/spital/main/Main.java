package factorymethod.spital.main;

import factorymethod.spital.classes.IPersonalSpital;
import factorymethod.spital.classes.PersonalNonMedical;
import factorymethod.spital.classes.TipPersonalMedical;
import factorymethod.spital.classes.TipPersonalNonMedical;
import factorymethod.spital.factory.IPersonalSpitalFactory;
import factorymethod.spital.factory.PersonalMedicalFactory;
import factorymethod.spital.factory.PersonalNonMedicalFactory;

public class Main {
    public static void main(String[] args) {
        IPersonalSpitalFactory fabricaPersonalMedical = new PersonalMedicalFactory();
        IPersonalSpitalFactory fabricaPersonalNonMedical = new PersonalNonMedicalFactory();

        IPersonalSpital medic = fabricaPersonalMedical.getPersonalSpital(TipPersonalMedical.MEDIC,"Maria",45);
        medic.descriere();
        IPersonalSpital asistent = fabricaPersonalMedical.getPersonalSpital(TipPersonalMedical.ASISTENT,"Mioara",50);
        asistent.descriere();

       IPersonalSpital secretar =fabricaPersonalNonMedical.getPersonalSpital(TipPersonalNonMedical.SECRETAR,"Ioan",50,4.5f);
       secretar.descriere();

        IPersonalSpital bracadier =fabricaPersonalNonMedical.getPersonalSpital(TipPersonalNonMedical.BRACADIER,"Matei",30,2.0f);
        bracadier.descriere();

        IPersonalSpital registrator =fabricaPersonalNonMedical.getPersonalSpital(TipPersonalNonMedical.REGISTRATOR,"Alina",25,1.5f);
        registrator.descriere();

    }
}
