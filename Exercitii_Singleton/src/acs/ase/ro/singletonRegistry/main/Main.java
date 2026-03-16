package acs.ase.ro.singletonRegistry.main;

import acs.ase.ro.singletonRegistry.classes.ProdusPromo;

public class Main {
    public static void main(String[] args) {
        ProdusPromo produs1 = ProdusPromo.getInstance("Laptop","Electrocasnice ",2300f);
        ProdusPromo produs2 = ProdusPromo.getInstance("Casti", "Periferice ",90f);
        ProdusPromo produs3 = ProdusPromo.getInstance("Cuptor", "Electrocasnice ",986f);

        produs1.afiseazaDetalii();
        produs2.afiseazaDetalii();
        produs3.afiseazaDetalii();

        System.out.println("produs1 == produs2 ? " + (produs1 == produs2));
        System.out.println("produs1 == produs3 ? " + (produs1 == produs3));

    }
}
