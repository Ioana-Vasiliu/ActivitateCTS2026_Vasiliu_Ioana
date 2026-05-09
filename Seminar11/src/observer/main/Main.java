package observer.main;

import observer.classes.ISpital;
import observer.classes.Pacient;
import observer.classes.PacientAbonat;
import observer.classes.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Ion", 22);
        Pacient pacient2 = new PacientAbonat("Maria", 33);
        Pacient pacient3 = new PacientAbonat("Mioara", 69);

        ISpital spital1 = new Spital("Cantacuzino");

        spital1.aboneazaPacient(pacient1);
        spital1.aboneazaPacient(pacient2);
        spital1.aboneazaPacient(pacient3);

        ((Spital) spital1).notificaVirus();
        spital1.dezaboneazaPacient(pacient3);

        System.out.println("==========================");

        ((Spital) spital1).notificaEpidemie();
    }
}
