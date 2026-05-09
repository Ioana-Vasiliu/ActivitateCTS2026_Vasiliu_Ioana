package adapter.clase.farmacie;

public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void cumparaMedicament() {
        System.out.println("Medicamentul cu numele " + numeMedicament + " a fost achizitionat din farmacie.");
    }
}