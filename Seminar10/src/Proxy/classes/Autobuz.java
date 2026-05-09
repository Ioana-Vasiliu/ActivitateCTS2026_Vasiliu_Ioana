package Proxy.classes;

public class Autobuz implements MijlocTransport{

    private int nrPasageri;
    private int nrLinie;
    private TipCursa tipCursa;

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = TipCursa.CURSA_NORMALA;
    }

    public Autobuz(int nrPasageri, int nrLinie, TipCursa tipCursa) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul " + nrLinie + " opreste la " + statie.getNumeStatie());
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    @Override
    public TipCursa getTipCursa() {
        return null;
    }
}
