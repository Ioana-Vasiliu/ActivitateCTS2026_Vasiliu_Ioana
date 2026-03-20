package acs.cts.FactoryMethod.classes;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii);

    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire);

    //am facut 2 -  una pt supa si una pt desert

}
