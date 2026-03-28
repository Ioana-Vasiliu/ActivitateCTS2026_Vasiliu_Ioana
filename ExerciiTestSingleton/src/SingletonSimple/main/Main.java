package SingletonSimple.main;

import SingletonSimple.classes.Comanda;
import SingletonSimple.classes.Cuptor;

public class Main {
    public static void main(String[] args) {
        Comanda c1 = new Comanda(20,"Pizza",220);
        Comanda c2 = new Comanda(30,"Prajitura",180);
        Comanda c3 = new Comanda(25,"Banana bread",175);

        Cuptor cuptor1 =  Cuptor.getInstance(200);
        cuptor1.addComanda(c1);
        cuptor1.addComanda(c2);
        cuptor1.addComanda(c3);

        cuptor1.afisareComenziAsteptare();
        System.out.println(cuptor1.getTimpAsteptare());

    }
}
