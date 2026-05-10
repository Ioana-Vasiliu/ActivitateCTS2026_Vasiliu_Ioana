package ExercitiiProxy.Restaurant;

public class Main {
    public static void main(String[] args) {
        RezervareRestaurant rezervare1 = new RezervareRestaurant("Andrei ",5);
        IRezervare proxy = new ProxyRezervare(rezervare1);
        proxy.realizeazaRezervare();

        RezervareRestaurant rezervare2 = new RezervareRestaurant("Maria",2 );
        IRezervare proxy2 = new ProxyRezervare(rezervare2);
        proxy2.realizeazaRezervare();

    }
}
