package ExercitiiAdapter.STB.main;

import ExercitiiAdapter.STB.classes.AbonamentSubteran;
import ExercitiiAdapter.STB.classes.AbonamentTerestru;
import ExercitiiAdapter.STB.classes.AdapterAbonament;

public class Main {
    public static void genereazaAbonamentOras(AbonamentTerestru abonamentTerestru){
        abonamentTerestru.genereazaAbonamentTerestru();
    }

    public static void main(String[] args) {
        AbonamentTerestru ab1 = new AbonamentTerestru("Silver",120);
        AbonamentSubteran ab2 = new AbonamentSubteran(2,160);
        genereazaAbonamentOras(ab1);

        AdapterAbonament adapter = new AdapterAbonament(ab2);
        genereazaAbonamentOras(adapter);


    }
}
