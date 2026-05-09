package facade.clase;


public class Medic {
    public boolean areTrimiterePacient(Pacient pacient) {
        return pacient.getGravitatie() > 5;
    }
}