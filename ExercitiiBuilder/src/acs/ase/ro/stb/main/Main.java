package acs.ase.ro.stb.main;

import acs.ase.ro.stb.classes.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuz1 = new AutobuzLinie.Builder("Mercedes","Ion Popescu").build();
        System.out.println(autobuz1);

        AutobuzLinie autobuz2 = new AutobuzLinie.Builder("Model 1","Vasile").setDeschideUsile(true).setTextEcran("Linia 1").build();
        System.out.println(autobuz2);
    }
}
