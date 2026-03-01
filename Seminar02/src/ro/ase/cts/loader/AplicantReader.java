package ro.ase.cts.loader;

import ro.ase.cts.clase.Aplicant;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    protected void readAplicant(Scanner input, Aplicant outAplicant){
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nr = input.nextInt();

        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++) {
            vect[i] = input.next();
        }

        outAplicant.setNume(nume);
        outAplicant.setPrenume(prenume);
        outAplicant.setPunctaj(punctaj);
        outAplicant.setVarsta(varsta);
        outAplicant.setNr_proiecte(nr);

    }
}