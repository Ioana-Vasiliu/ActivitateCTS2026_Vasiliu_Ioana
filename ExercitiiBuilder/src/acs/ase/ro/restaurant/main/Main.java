package acs.ase.ro.restaurant.main;

import acs.ase.ro.restaurant.classes.Rezervare;
import acs.ase.ro.restaurant.classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();

        Rezervare rezervare1 = builder.build();

        Rezervare rezervare2 = builder.setAsezareGeam(true).setScaunErgonomic(true).setMasaDecorata(true).setMuzicaAmbientala(true).setGenMuzica("Clasica").build();
        Rezervare rezervare3 = new RezervareBuilder().setMuzicaAmbientala(true).setGenMuzica("Jazz").build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);

    }
}
