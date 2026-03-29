package acs.ase.ro.imaginevirtuala.main;

import acs.ase.ro.imaginevirtuala.classes.ImagineVirtuala;
import acs.ase.ro.imaginevirtuala.classes.ImagineVirtualaBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ImagineVirtuala imagine = new ImagineVirtualaBuilder.Builder("Imagine 1")
                .adaugaAplicatie("Chrome")
                .adaugaAplicatie("Teams")
                .build();
        imagine.afiseazaDescriereImagineVirtuala();

        ImagineVirtuala imagine2 = new ImagineVirtualaBuilder.Builder("Imagine 2")
                .adaugaAplicatie("Discord")
                .adaugaAplicatie("Steam")
                .build();
        imagine2.afiseazaDescriereImagineVirtuala();
        imagine2.instaleazaAplicatie("Microsoft"); //testare eroare


    }
}
