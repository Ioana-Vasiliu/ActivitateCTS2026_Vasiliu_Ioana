package ExercitiiFacade.STB;

public class AutobuzFacade {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public AutobuzFacade() {
        this.usaFata = new UsaFata();
        this.usaMijloc = new UsaMijloc();
        this.usaSpate = new UsaSpate();
    }

    public void puneUsileInModLiber(){
        usaMijloc.punereModLiber();
        usaSpate.punereModLiber();
        usaFata.punereModLiber();

        System.out.println("Toate usile sunt in mod liber.");
    }

    public void deschideUsileFortat(){
        usaFata.deschidereFortata();
        usaSpate.deschidereFortata();
        usaMijloc.deschidereFortata();

        System.out.println("Usile sunt deschide fortat.");
    }

}
