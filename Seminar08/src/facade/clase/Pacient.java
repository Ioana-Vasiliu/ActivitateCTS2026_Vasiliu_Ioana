package facade.clase;

public class Pacient {
    private String numePacient;
    private int gravitatie;

    public Pacient(String numePacient, int gravitatie) {
        this.numePacient = numePacient;
        this.gravitatie = gravitatie;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public int getGravitatie() {
        return gravitatie;
    }
}
