package adapter.clase.spital;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Medicamentul " + nume + " a fost achizitionat din spital la pretul de " + pret);
        } else {
            System.out.println("Medicamentul " + nume + " nu poate fi achizitionat deoarece nu a prezentat reteta.");
        }
    }

    public boolean prezintaReteta() {
        return this.nume.length() < 10;
    }
}