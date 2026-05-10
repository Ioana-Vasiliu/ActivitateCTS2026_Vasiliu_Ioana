package ExercitiiDecorator.Avion;

public class Bilet implements IBilet{
    @Override
    public String getDescriere() {
        return "Biletul Initial " ;
    }

    @Override
    public double getPret() {
        return 300;
    }
}
