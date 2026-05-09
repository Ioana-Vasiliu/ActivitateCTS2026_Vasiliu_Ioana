package adapter.clase.adapterObiecte;

import adapter.clase.farmacie.Medicament;

public class Adapter extends Medicament {
    private adapter.clase.spital.Medicament medicamentSpital;

    public Adapter(adapter.clase.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}