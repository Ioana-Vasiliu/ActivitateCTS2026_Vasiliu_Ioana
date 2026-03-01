package ro.ase.cts.main;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.loader.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("WD = " + System.getProperty("user.dir"));
        java.io.File f = new java.io.File("angajati.txt");
        System.out.println("Path = " + f.getAbsolutePath() + " | exists=" + f.exists());
        List<Aplicant> listaAngajati;
        try {
            AngajatReader angajatReader = new AngajatReader();
            listaAngajati = angajatReader.readAplicanti("angajati.txt");
            for(Aplicant angajat:listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
    }

