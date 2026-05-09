package Proxy.classes;

public class AutobuzCursaSpeciala implements MijlocTransport{

    private MijlocTransport mijlocTransport;

    public AutobuzCursaSpeciala(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if (this.mijlocTransport.getTipCursa() == TipCursa.CURSA_SPECIALA){
            System.out.println("Autobuzul nu opreste in statie. O sa continue calatoria");
        } else {
            this.mijlocTransport.opresteInStatie(statie);
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
