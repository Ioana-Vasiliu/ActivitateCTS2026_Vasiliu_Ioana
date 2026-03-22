package simple_factory1.classes;

public class Scuter implements VehiculLivrare{
    private String codVehicul;
    private String zonaOperare;
    private int capacitateKg;
    private int autonomieKm;

    public Scuter(String codVehicul, String zonaOperare, int capacitateKg, int autonomieKm) {
        this.codVehicul = codVehicul;
        this.zonaOperare = zonaOperare;
        this.capacitateKg = capacitateKg;
        this.autonomieKm = autonomieKm;
    }

    @Override
    public String getCodVehicul() {
        return codVehicul;
    }

    @Override
    public String getZonaOperare() {
        return zonaOperare;
    }

    @Override
    public int getCapacitateKg() {
        return capacitateKg;
    }

    @Override
    public int getAutonomieKm() {
        return autonomieKm;
    }

    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Scuterul are Cod vehicul : ").append(this.codVehicul);
        builder.append("Zona operare : ").append(this.zonaOperare);
        builder.append("Capacitate Kg : ").append(this.capacitateKg);
        builder.append("Autonomie Km : ").append(this.autonomieKm);

        System.out.println(builder);
    }
}
