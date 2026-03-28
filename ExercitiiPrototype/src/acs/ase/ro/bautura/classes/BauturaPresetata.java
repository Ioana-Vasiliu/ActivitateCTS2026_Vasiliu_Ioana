package acs.ase.ro.bautura.classes;

import java.util.ArrayList;
import java.util.List;

public class BauturaPresetata implements IBautura,IPrototype{
    private String denumireBautura;
    private double pret;
    private float volum;
    private List<String> ingrediente = new ArrayList<>();


    public BauturaPresetata(String denumireBautura, double pret, float volum, List<String> ingrediente) {
        this.denumireBautura = denumireBautura;
        this.pret = pret;
        this.volum = volum;
        this.ingrediente = new ArrayList<>(ingrediente);
    }

    public BauturaPresetata() {

    }

    public void setDenumireBautura(String denumireBautura) {
        this.denumireBautura = denumireBautura;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = new ArrayList<>(ingrediente);
    }

    @Override
    public void preparare() {
        System.out.println("Se prepara " + this.denumireBautura + " prin fierberea apei si adaugarea ingredientelor: " + this.ingrediente);
    }

    @Override
    public String getDetalii() {
        return ("Bautura :" + this.denumireBautura + " volumul: " + this.volum + " pretul : " + this.pret + " si contine ingredientele : " + this.ingrediente);
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public List<String> getIngrediente() {
        return new ArrayList<>(this.ingrediente);
    }

    @Override
    public BauturaPresetata cloneaza() {
        BauturaPresetata bautura = new BauturaPresetata();
        bautura.denumireBautura = this.denumireBautura;
        bautura.pret = this.pret;
        bautura.volum = this.volum;
        bautura.ingrediente = new ArrayList<>(this.ingrediente);

        return bautura;
    }
}
