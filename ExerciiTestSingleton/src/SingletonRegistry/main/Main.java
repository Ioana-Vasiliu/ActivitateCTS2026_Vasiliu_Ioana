package SingletonRegistry.main;

import SingletonRegistry.classes.Cuptor;
import SingletonSimple.classes.Comanda;

public class Main {
    public static void main(String[] args) {

        Comanda c1 = new Comanda(20, "Pizza", 220);
        Comanda c2 = new Comanda(15, "Paine cu usturoi", 180);
        Comanda c3 = new Comanda(30, "Lasagna", 200);
        Comanda c4 = new Comanda(25, "Friptura", 260);

        Cuptor cuptor1 = Cuptor.getInstance("cuptor1", 250);
        Cuptor cuptor2 = Cuptor.getInstance("cuptor2", 200);
        Cuptor cuptor3 = Cuptor.getInstance("cuptor3", 300);
        Cuptor cuptor4 = Cuptor.getInstance("cuptor4", 180);

        cuptor1.addComanda(c1);
        cuptor2.addComanda(c2);
        cuptor2.addComanda(c3);
        cuptor3.addComanda(c4);

        System.out.println("Comenzi cuptor1:");
        cuptor1.afisareComenziAsteptare();
        System.out.println("Timp asteptare cuptor1: " + cuptor1.getTimpAsteptare());
        System.out.println();

        System.out.println("Comenzi cuptor2:");
        cuptor2.afisareComenziAsteptare();
        System.out.println("Timp asteptare cuptor2: " + cuptor2.getTimpAsteptare());
        System.out.println();

        System.out.println("Comenzi cuptor3:");
        cuptor3.afisareComenziAsteptare();
        System.out.println("Timp asteptare cuptor3: " + cuptor3.getTimpAsteptare());
        System.out.println();

        System.out.println("Comenzi cuptor4:");
        cuptor4.afisareComenziAsteptare();
        System.out.println("Timp asteptare cuptor4: " + cuptor4.getTimpAsteptare());
        System.out.println();

        Cuptor test = Cuptor.getInstance("cuptor1", 500);
        System.out.println("Verificare registry:");
        System.out.println(cuptor1 == test);
    }
}
