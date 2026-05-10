package ExercitiiStrategy.Livrari;

public class LivrareInternationala implements IStrategieLivrare{

    @Override
    public double calculeazaCost(double valoareComanda) {
        return 100;
    }
}
