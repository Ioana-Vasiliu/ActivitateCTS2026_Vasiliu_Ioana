package acs.ase.ro.imaginevirtuala.main;

import acs.ase.ro.imaginevirtuala.classes.ImagineVirtuala;
import acs.ase.ro.imaginevirtuala.classes.ImagineVirtualaConcreta;

public class Main {
    public static void main(String[] args) {
        ImagineVirtualaConcreta imagineVirtuala1 = new ImagineVirtualaConcreta();
        imagineVirtuala1.instaleazaAplicatie("Chrome");
        imagineVirtuala1.instaleazaAplicatie("Visual Studio");
        imagineVirtuala1.instaleazaAplicatie("Microsoft Office");
        imagineVirtuala1.instaleazaAplicatie("IntelliJ");

        //imaginea initiala
        System.out.println("Imagine initiala : ");
        imagineVirtuala1.afiseazaDescriereImagineVirtuala();
        System.out.println("\n");

        //clonarile
        System.out.println("Prima clona identica :");

        ImagineVirtualaConcreta imagine1 = (ImagineVirtualaConcreta) imagineVirtuala1.copiaza();
        imagine1.afiseazaDescriereImagineVirtuala();
        System.out.println("\n");


        System.out.println("Clonele modificate :");
        //modific o clona
        imagine1.instaleazaAplicatie("Discord");
        imagine1.afiseazaDescriereImagineVirtuala();

        ImagineVirtuala imagine2= (ImagineVirtualaConcreta) imagineVirtuala1.copiaza();
        imagine2.instaleazaAplicatie("Teams");
        imagine2.afiseazaDescriereImagineVirtuala();
    }
}
