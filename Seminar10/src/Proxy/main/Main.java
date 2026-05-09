package Proxy.main;

import Proxy.classes.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(23, 268);
        MijlocTransport autobuz2 = new Autobuz(0, 226);

        Statie statie = new Statie("Romana", 10);
        Statie statie2 = new Statie("Uni", 0);

        autobuz.opresteInStatie(statie);
        autobuz2.opresteInStatie(statie2);

        MijlocTransport autobuzNoapte = new AutobuzNoapte(autobuz);
        MijlocTransport autobuzNoapte2 = new AutobuzNoapte(autobuz2);

        autobuzNoapte.opresteInStatie(statie);
        autobuzNoapte2.opresteInStatie(statie2);

        System.out.println("===========================================");

        MijlocTransport autobuzSpecial = new Autobuz(12, 6, TipCursa.CURSA_SPECIALA);
        MijlocTransport autobuzSpecialCursa = new AutobuzCursaSpeciala(autobuzSpecial);
        MijlocTransport autobuzSpecial168 = new AutobuzCursaSpeciala(autobuz);

        autobuzSpecialCursa.opresteInStatie(statie);
        autobuzSpecial168.opresteInStatie(statie);

    }
}