package command.main;

import command.classes.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Ana");
        PersonalSpital asistenta = new Asistenta("Maria");

        Pacient pacient1 = new Pacient("Ion");
        Pacient pacient2 = new Pacient("Mihai");

        Comanda comanda1 = new Internare(medic, pacient1);
        Comanda comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();

        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);

        operator.inregistreaza(new Tratare(asistenta,new  Pacient("Ionela")));
        operator.executaFisa();
        operator.executaFisa();
        operator.executaFisa();

    }
}
