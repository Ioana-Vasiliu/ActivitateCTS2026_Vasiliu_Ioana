package acs.ase.ro.imaginevirtuala.classes;

import java.util.ArrayList;
import java.util.List;

public class ImagineVirtualaConcreta implements ImagineVirtuala, Prototype {

    private List<String> aplicatiiInstalate = new ArrayList<>();



    @Override
    public List<String> getAplicatiiInstalate() {
        return this.aplicatiiInstalate;
    }

    @Override
    public void afiseazaDescriereImagineVirtuala() {
        System.out.println("Imaginea virtuala cu aplicatiile: " + this.aplicatiiInstalate);

    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {
        this.aplicatiiInstalate.add(numeAplicatie);

    }

    @Override
    public Prototype copiaza() {
        ImagineVirtualaConcreta imagineVirtuala = new ImagineVirtualaConcreta();
        imagineVirtuala.aplicatiiInstalate = new ArrayList<>(this.aplicatiiInstalate);

        return imagineVirtuala;
    }
}
