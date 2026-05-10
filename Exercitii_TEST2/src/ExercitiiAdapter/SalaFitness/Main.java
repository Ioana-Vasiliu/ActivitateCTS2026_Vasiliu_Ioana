package ExercitiiAdapter.SalaFitness;

public class Main {
    public static void genereazaAbonamentFinal(IAbonamentSala abonamentSala){
        abonamentSala.activeazaAbonamentSala();
    }

    public static void main(String[] args) {
        AbonamentSala ab1 = new AbonamentSala("Platinum", 450);
        AbonamentPiscina ab2 = new AbonamentPiscina(250);

        genereazaAbonamentFinal(ab1);
        AdapterAbonamentSala adapter = new AdapterAbonamentSala(ab2);
        genereazaAbonamentFinal(adapter);
    }
}
