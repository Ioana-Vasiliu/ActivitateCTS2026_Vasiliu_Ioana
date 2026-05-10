package ExercitiiFacade.Cinematograf;

public class CinemaFacade implements ISistemCinema{
    private SistemAerConditionat sistemAerConditionat;
    private SistemAudio sistemAudio;
    private SistemLumini sistemLumini;
    private SistemProiectie sistemProiectie;

    public CinemaFacade() {
        this.sistemAerConditionat = new SistemAerConditionat();
        this.sistemAudio = new SistemAudio();
        this.sistemLumini = new SistemLumini();
        this.sistemProiectie = new SistemProiectie();
    }

    @Override
    public void pornesteSistem() {
        sistemAudio.pornesteSistemAudio();
        sistemLumini.pornesteLumini();
        sistemProiectie.pornesteProiectii();
        sistemAerConditionat.pornesteAerConditionat();
    }
}
