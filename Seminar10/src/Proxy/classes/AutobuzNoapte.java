package Proxy.classes;

public class AutobuzNoapte implements MijlocTransport {

    private MijlocTransport mijlocTransport;

    public AutobuzNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if (statie.getNrCalatori() > 0 || this.mijlocTransport.getNrPasageri() > 0) {
            this.mijlocTransport.opresteInStatie(statie);
        } else {
            System.out.println("Autobuzul nu opreste in statie. O sa continue calatoria");
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocTransport.getTipCursa();
    }
}