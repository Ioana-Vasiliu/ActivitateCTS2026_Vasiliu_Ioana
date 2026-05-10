package ExercitiiProxy.Restaurant;

public class ProxyRezervare implements IRezervare{
    private RezervareRestaurant rezervareRestaurant;

    public ProxyRezervare(RezervareRestaurant rezervareRestaurant) {
        this.rezervareRestaurant = rezervareRestaurant;
    }


    @Override
    public void realizeazaRezervare() {
        if(rezervareRestaurant.getNrPersoane() >= 4){
            rezervareRestaurant.realizeazaRezervare();

        }else{
            System.out.println("Sunt necesare minim 4 persoane");
        }
    }
}
