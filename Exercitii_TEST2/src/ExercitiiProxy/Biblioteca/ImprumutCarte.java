package ExercitiiProxy.Biblioteca;

public class ImprumutCarte implements IImprumutCarte{
    private int varstaCititor;
    private String titluCarte;

    public ImprumutCarte(int varstaCititor, String titluCarte) {
        this.varstaCititor = varstaCititor;
        this.titluCarte = titluCarte;
    }

    public int getVarstaCititor() {
        return varstaCititor;
    }

    @Override
    public void imprumutaCarte() {
        System.out.println("Varsta cititorului este de: " + varstaCititor + " si a imprumutat cartea : " + titluCarte);
    }
}
