package acs.ase.ro.reclama.main;

import acs.ase.ro.reclama.classes.Reclama;

public class Main {
    public static void main(String[] args) {
        Reclama reclamaInitiala = new Reclama("Coca-Cola",10,5,"Bucuresti");

        Reclama reclamaClonata = reclamaInitiala.cloneaza();

        System.out.println("Reclama initiala : ");
        System.out.println(reclamaInitiala.getDescriere());

        System.out.println("Reclama clonata: ");
        System.out.println(reclamaClonata.getDescriere());

        Reclama reclamaModificata = reclamaInitiala.cloneaza();
        reclamaModificata.setOrasPromovat("Constanta");
        System.out.println("Reclama modificata : ");
        System.out.println(reclamaModificata.getDescriere());

    }
}
