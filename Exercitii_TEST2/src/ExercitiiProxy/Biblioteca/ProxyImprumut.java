package ExercitiiProxy.Biblioteca;

public class ProxyImprumut implements IImprumutCarte{
    private ImprumutCarte imprumutCarte;

    public ProxyImprumut(ImprumutCarte imprumutCarte) {
        this.imprumutCarte = imprumutCarte;
    }

    @Override
    public void imprumutaCarte() {
        if(imprumutCarte.getVarstaCititor()>=18){
            imprumutCarte.imprumutaCarte();
        }
        else{
            System.out.println("Cititorul are sub 18 ani");
        }
    }
}
