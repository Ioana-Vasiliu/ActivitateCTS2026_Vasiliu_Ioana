package acs.ase.ro.singletonRegistry.classes;

import java.util.HashMap;
import java.util.Map;

public class ProdusPromo implements Produs{
    private String denumire;
    private String categorie;
    private double pret;

    private static Map<String, ProdusPromo> registry = new HashMap<>();

    private ProdusPromo(String denumire, String categorie, double pret) {
        this.denumire = denumire;
        this.categorie = categorie;
        this.pret = pret;
    }

    public static synchronized ProdusPromo getInstance(String denumire, String categorie, double pret){
        if(!registry.containsKey(categorie)){
            registry.put(categorie, new ProdusPromo(denumire,categorie,pret));
        }
        return registry.get(categorie);
    }


    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Denumire: ").append(this.denumire).append("\n");
        builder.append("Categorie: ").append(this.categorie).append("\n");
        builder.append("Pret: ").append(this.pret).append("\n");

        System.out.println(builder);
    }



    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public String getCategorie() {
        return categorie;
    }

    @Override
    public double getPret() {
        return pret;
    }
}
