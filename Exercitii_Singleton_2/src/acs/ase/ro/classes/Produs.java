package acs.ase.ro.classes;

import java.util.HashMap;
import java.util.Map;

public class Produs implements ProdusGeneric{
    private float stoc;
    private String numeProdus;

    private static Map<String, Produs> registry = new HashMap<>();

    private Produs(float stoc, String numeProdus) {
        this.stoc = stoc;
        this.numeProdus = numeProdus;
    }

    public static synchronized Produs getInstance(float stoc, String numeProdus){
        if(!registry.containsKey(numeProdus)){
            registry.put(numeProdus,new Produs(stoc, numeProdus));
        }
        else{
            registry.get(numeProdus).cresteStoc((int) stoc);
        }
        return registry.get(numeProdus);
    }



    @Override
    public float getStoc() {
        return stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        StringBuilder builder = new StringBuilder();
        builder.append("Stocul produsului este : ").append(this.stoc).append(" si denumirea acestuia : ").append(this.numeProdus).append("\n");
        System.out.println(builder);
    }

    @Override
    public String getNumeProdus() {
        return numeProdus;
    }

    @Override
    public void cresteStoc(int nrProduse) {
        this.stoc += nrProduse;

    }
}
