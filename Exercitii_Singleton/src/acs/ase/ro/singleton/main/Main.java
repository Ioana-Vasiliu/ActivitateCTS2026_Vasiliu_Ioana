package acs.ase.ro.singleton.main;

import acs.ase.ro.singleton.classes.ProdusMagazin;

public class Main {
    public static void main(String[] args) {
        ProdusMagazin produs1 = ProdusMagazin.getInstance("Laptop ", " Electrocasnice ",350.5f);
        ProdusMagazin produs2  =ProdusMagazin.getInstance("Laptop "," IT",670f);
        ProdusMagazin produs3 = ProdusMagazin.getInstance("Mouse "," Periferice", 53.f);

        produs1.afiseazaDetalii();
        produs2.afiseazaDetalii();
        produs3.afiseazaDetalii();

    }
}
