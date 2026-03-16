package acs.ase.ro.main;

import acs.ase.ro.classes.Produs;

public class Main {
    public static void main(String[] args) {
        Produs produs1 = Produs.getInstance(12,"Laptop");
        Produs produs2 = Produs.getInstance(20,"Laptop");
        Produs produs3 = Produs.getInstance(1,"Tastatura");
        Produs produs4 = Produs.getInstance(7,"Tastatura");

        System.out.println("Stoc laptop: " + produs1.getStoc());
        System.out.println("Stoc tastatura: " + produs3.getStoc());


        produs1.afiseazaDescriereProdus();
        produs2.afiseazaDescriereProdus();
        produs3.afiseazaDescriereProdus();
        produs4.afiseazaDescriereProdus();


    }
}
