package ExercitiiProxy.Restaurant;

public class RezervareRestaurant implements IRezervare{
    private String numeClient;
    private int nrPersoane;

    public RezervareRestaurant(String numeClient, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
    }


    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void realizeazaRezervare() {
        System.out.println("Rezervarea pentru : " + numeClient + " este pentru : "+ nrPersoane + " persoane" );


    }
}
