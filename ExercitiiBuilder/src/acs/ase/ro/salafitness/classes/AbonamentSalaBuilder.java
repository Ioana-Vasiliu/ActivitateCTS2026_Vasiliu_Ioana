package acs.ase.ro.salafitness.classes;

import java.util.ArrayList;
import java.util.List;

public class AbonamentSalaBuilder implements IAbonamentSala {
    private final String denumireAbonament;
    private final List<String> listaServicii;
    private final boolean accesPiscina;
    private final boolean accesWeekend;

    private AbonamentSalaBuilder(Builder builder) {
        this.denumireAbonament = builder.denumireAbonament;
        this.listaServicii = new ArrayList<>(builder.listaServicii);
        this.accesPiscina = builder.accesPiscina;
        this.accesWeekend = builder.accesWeekend;
    }

    @Override
    public List<String> getServiciiIncluse() {
        return new ArrayList<>(listaServicii);
    }

    @Override
    public void afiseazaDetaliiAbonament() {
        System.out.println("Denumire abonament : " + this.denumireAbonament
        + " lista de servicii : " + this.listaServicii
        + " permite acces piscina? " + this.accesPiscina
        + " acces nelimitat in weekend? " + this.accesWeekend);

    }

    @Override
    public void adaugaServiciu(String numeServiciu) {
        System.out.println("Nu se pot adauga servicii dupa ce abonamentul a fost creat! ");

    }

    //CLASA BUILDER STATICA
    public static class Builder {
        private final String denumireAbonament;
        private final List<String> listaServicii;
        private boolean accesPiscina;
        private boolean accesWeekend;

        public Builder(String denumireAbonament) {
            this.denumireAbonament = denumireAbonament;
            this.listaServicii = new ArrayList<>();
        }

        public Builder setAccesPiscina(boolean accesPiscina) {
            this.accesPiscina = accesPiscina;
            return this;
        }

        public Builder setAccesWeekend(boolean accesWeekend) {
            this.accesWeekend = accesWeekend;
            return this;
        }

        public Builder adaugaServiciu(String numeServiciu) {
            this.listaServicii.add(numeServiciu);
            return this;

        }

        public AbonamentSalaBuilder build(){
            return new AbonamentSalaBuilder(this);
        }
    }
}
