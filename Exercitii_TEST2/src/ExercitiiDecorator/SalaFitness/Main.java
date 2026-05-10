package ExercitiiDecorator.SalaFitness;

public class Main {
    public static void main(String[] args) {
        IAbonament a1 = new AbonamentSimplu();
        System.out.println(a1.getDescriere());
        System.out.println(a1.getPret());

        a1 = new AccesPiscina(a1);
        a1 = new AccesSauna(a1);
        System.out.println(a1.getDescriere());
        System.out.println(a1.getPret());
    }
}
