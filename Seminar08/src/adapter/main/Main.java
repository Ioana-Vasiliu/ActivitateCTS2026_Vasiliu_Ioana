package adapter.main;

import adapter.clase.adapterObiecte.Adapter;

public class Main {

    public static void procuraMedicament(adapter.clase.farmacie.Medicament medicamentFarmacie) {
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        adapter.clase.spital.Medicament medicamentSpital =
                new adapter.clase.spital.Medicament("Nurofen", 40);

        adapter.clase.farmacie.Medicament medicamentFarmacie =
                new adapter.clase.farmacie.Medicament("Paracetamol");

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();

        System.out.println("================================================");

        procuraMedicament(medicamentFarmacie);

        Adapter adapter = new Adapter(medicamentSpital);
        procuraMedicament(adapter);
    }
}