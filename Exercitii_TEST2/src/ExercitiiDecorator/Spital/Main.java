package ExercitiiDecorator.Spital;

public class Main {
    public static void main(String[] args) {
        IRezultat rezultat = new RezultatPrintat("Popescu");


        IRezultat rezultat1 = new RezultatOnline(rezultat);
        rezultat1.puneLaDispozitieRezultat();
    }
}
