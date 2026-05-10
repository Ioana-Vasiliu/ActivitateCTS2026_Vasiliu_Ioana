package ExercitiiFacade.Restaurant;

public class RestaurantFacade {
    private VerificaMasaLibera verificaMasaLibera;
    private VerificaCuratareMasa verificaCuratareMasa;
    private VerificaServetele verificaServetele;

    public RestaurantFacade() {
        this.verificaMasaLibera = new VerificaMasaLibera();
        this.verificaCuratareMasa = new VerificaCuratareMasa();
        this.verificaServetele = new VerificaServetele();
    }

    public void pregatesteMasaClient(int nrMasa){
        verificaMasaLibera.verificaMasaLibera(nrMasa);
        verificaCuratareMasa.verificaCuratareMasa(nrMasa);
        verificaServetele.verificaServetele(nrMasa);

        System.out.println("Masa " + nrMasa + " poate fi oferita clientului");
    }

}
