package ExercitiiAdapter.PlatformaLivrari;

public class AdapterLivrare implements IComandaLivrare{
    private LivrareExterna livrareExterna;

    public AdapterLivrare(LivrareExterna livrareExterna) {
        this.livrareExterna = livrareExterna;
    }

    @Override
    public void proceseazaLivrare() {
        livrareExterna.proceseazaLivrareExterna();
    }
}
