package acs.ase.ro.bautura.main;

import acs.ase.ro.bautura.classes.BauturaPresetata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ingrediente = new ArrayList<>();
        ingrediente.add("espresso");
        ingrediente.add("lapte");

        BauturaPresetata bautura1 = new BauturaPresetata("Latte", 20f, 250f, ingrediente);


        BauturaPresetata bautura3 = bautura1.cloneaza();
        bautura3.setDenumireBautura("Cappuccino");
        bautura3.getIngrediente().add("caramel");
        ArrayList<String> listaNoua = new ArrayList<>(bautura3.getIngrediente());
        listaNoua.add("caramel");
        bautura3.setIngrediente(listaNoua);

        System.out.println("Bautura 1: " + bautura1.getDetalii());
        System.out.println("Bautura 3: " + bautura3.getDetalii());


    }
}
