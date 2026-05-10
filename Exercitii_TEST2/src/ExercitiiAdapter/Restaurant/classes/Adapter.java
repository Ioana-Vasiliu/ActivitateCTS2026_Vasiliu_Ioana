package ExercitiiAdapter.Restaurant.classes;


public class Adapter extends FacturaBucatarie{
    private LucruBar lucruBar;

    public Adapter(LucruBar lucruBar) {
        super(lucruBar.getBautura(),lucruBar.getPret());
        this.lucruBar = lucruBar;
    }

    @Override
    public void printeazaFactura() {
        lucruBar.printeazaBonBar();
    }
}
