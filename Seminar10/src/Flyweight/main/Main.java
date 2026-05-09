package Flyweight.main;

import Flyweight.clase.Autobuz;
import Flyweight.clase.ManagerLinii;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz101 = new Autobuz("Mercedez", 2001, 30);
        Autobuz autobuz112 = new Autobuz("Opel", 2002, 10);
        Autobuz autobuz21 = new Autobuz("Prada", 2003, 60);

        ManagerLinii managerLinii = new ManagerLinii();
        managerLinii.getLinie(101, "Romana", "Universitate").nrMaximPasageriPeLinie(autobuz101);
        managerLinii.getLinie(101, "Romqwesana", "Univerqwaessitate").descriereLinie(autobuz101);


    }
}
