package ExercitiiProxy.PlatformaStreaming;

public class Film implements IFilm{
    private String numeFilm;
    private boolean abonamentPremium;

    public Film(String numeFilm, boolean abonamentPremium) {
        this.numeFilm = numeFilm;
        this.abonamentPremium = abonamentPremium;
    }

    public boolean isAbonamentPremium() {
        return abonamentPremium;
    }

    @Override
    public void redaFilm() {
        System.out.println("Se reda filmul : " + numeFilm + " , si clientul are abonament premium? " + abonamentPremium);

    }
}
