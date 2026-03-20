package acs.cts.FactoryMethod.classes;

public abstract class Desert implements FelDeMancare {
    protected float gramaj;
    protected String denumire;
    protected  int calorii;

    //trebuie sa avem obligatoriu constructor


    public Desert(float gramaj, String denumire, int calorii) {
        this.gramaj = gramaj;
        this.denumire = denumire;
        this.calorii = calorii;
    }
}
