package acs.ase.ro.restaurant.classes;

public class Rezervare {
    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean masaDecorata;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public Rezervare(boolean asezareGeam, boolean scaunErgonomic, boolean masaDecorata, boolean muzicaAmbientala, String genMuzica) {
        this.asezareGeam = asezareGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.masaDecorata = masaDecorata;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", masaDecorata=").append(masaDecorata);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
