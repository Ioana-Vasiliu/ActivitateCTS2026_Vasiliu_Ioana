package factorymethod.service.classes;

public abstract class Componenta implements IComponenta {
    protected String culoareComponenta;
    protected String tipMaterial;
    protected boolean esteDetasabila;

    public Componenta(String culoareComponenta, String tipMaterial, boolean esteDetasabila) {
        this.culoareComponenta = culoareComponenta;
        this.tipMaterial = tipMaterial;
        this.esteDetasabila = esteDetasabila;
    }

    @Override
    public String getCuloareComponenta() {
        return this.culoareComponenta;
    }

    @Override
    public String tipMaterial() {
        return this.tipMaterial;
    }

    @Override
    public boolean esteDetasabila() {
        return this.esteDetasabila;
    }


}
