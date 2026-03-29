package acs.ase.ro.cursurionline.main;

import acs.ase.ro.cursurionline.classes.SesiuneCursBuilder;

public class Main {
    public static void main(String[] args) {
        SesiuneCursBuilder sesiune = new SesiuneCursBuilder.Builder("CTS").build();
        sesiune.afiseazaDetaliiSesiune();

        SesiuneCursBuilder sesiune2 = new SesiuneCursBuilder.Builder("Algebra").adaugaMaterial("Caiet").adaugaMaterial("pix").setInregistratAutomat(true).build();
        sesiune2.afiseazaDetaliiSesiune();

        SesiuneCursBuilder sesiune3 = new SesiuneCursBuilder.Builder("POO").adaugaMaterial("Laptop").adaugaMaterial("Caiet").setPermiteAccesFaraAprobare(true).build();
        sesiune3.afiseazaDetaliiSesiune();


    }
}
