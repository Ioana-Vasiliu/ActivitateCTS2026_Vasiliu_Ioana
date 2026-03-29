package acs.ase.ro.restaurant.classes;

public class RezervareBuilder implements IRezervareBuilder{

    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean masaDecorata;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public RezervareBuilder() {
        this.asezareGeam = false;
        this.scaunErgonomic = false;
        this.masaDecorata = false;
        this.muzicaAmbientala = false;
        this.genMuzica = "";
    }


    public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilder setMasaDecorata(boolean masaDecorata) {
        this.masaDecorata = masaDecorata;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(
                this.asezareGeam,
                this.scaunErgonomic,
                this.masaDecorata,
                this.muzicaAmbientala,
                this.genMuzica
        );
    }
}
