package acs.ase.ro.singleton.classes;

public class ProdusMagazin implements Produs{
    private String numeProdus;
    private String categorie;
    private float pret;
    private static ProdusMagazin instance = null;

    private ProdusMagazin(String numeProdus, String categorie, float pret) {
        this.numeProdus = numeProdus;
        this.categorie = categorie;
        this.pret = pret;
    }

    public static synchronized ProdusMagazin getInstance(String numeProdus,String categorie,float pret){
        if (instance==null){
            instance = new ProdusMagazin(numeProdus,categorie,pret);
        }
        return instance;
    }

    public void afiseazaDetalii(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.numeProdus).append(this.categorie).append(this.pret);
        System.out.println(builder);

    }



    @Override
    public String getNumeProdus() {
        return numeProdus;
    }

    @Override
    public String getCategorie() {
        return categorie;
    }

    @Override
    public float getPret() {
        return pret;
    }
}
