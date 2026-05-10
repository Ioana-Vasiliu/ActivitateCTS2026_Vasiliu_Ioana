package ExercitiiProxy.PlatformaStreaming;

public class ProxyFilm implements IFilm{
    private Film film;

    public ProxyFilm(Film film) {
        this.film = film;
    }



    @Override
    public void redaFilm() {
        if(film.isAbonamentPremium() == true){
            film.redaFilm();
        }
        else{
            System.out.println("Clientul nu are aboanement premium!");
        }
    }
}
