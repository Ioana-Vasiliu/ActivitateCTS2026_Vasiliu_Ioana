package ExercitiiDecorator.Avion;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1 = new Bilet();

        System.out.println(bilet1.getDescriere());
        System.out.println(bilet1.getPret());

        bilet1 = new MasaLaBord(bilet1);
        bilet1 = new BagajCala(bilet1);
        bilet1 = new ImbarcarePrioritara(bilet1);

        System.out.println(bilet1.getDescriere());
        System.out.println(bilet1.getPret());

    }
}
