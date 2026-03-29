package acs.ase.ro.cursurionline.classes;

import java.util.ArrayList;
import java.util.List;

public class SesiuneCursBuilder implements ISesiuneCurs{
    private final String denumireCurs;
    private final List<String> listaMateriale;
    private final boolean inregistratAutomat;
    private final boolean permiteAccesFaraAprobare;

    private SesiuneCursBuilder(Builder builder) {
        this.denumireCurs = builder.denumireCurs;
        this.listaMateriale = new ArrayList<>(builder.listaMateriale);
        this.inregistratAutomat = builder.inregistratAutomat;
        this.permiteAccesFaraAprobare = builder.permiteAccesFaraAprobare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SesiuneCursBuilder{");
        sb.append("denumireCurs='").append(denumireCurs).append('\'');
        sb.append(", listaMateriale=").append(listaMateriale);
        sb.append(", inregistratAutomat=").append(inregistratAutomat);
        sb.append(", permiteAccesFaraAprobare=").append(permiteAccesFaraAprobare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public List<String> getMateriale() {
        return this.listaMateriale;
    }

    @Override
    public void afiseazaDetaliiSesiune() {
        System.out.println("Seiune pentru cursul : " + this.denumireCurs + " necesita urmatoarele materiale: " + this.listaMateriale + " este inregistrat : " + this.inregistratAutomat + " permite acces : " + this.permiteAccesFaraAprobare);

    }

    @Override
    public void adaugaMaterial(String numeMaterial) {
        System.out.println("Nu se mai pot adauga materiale dupa ce a fost creat cursul! ");

    }

    public static class Builder{
        private final String denumireCurs;
        private final List<String> listaMateriale;
        private boolean inregistratAutomat;
        private boolean permiteAccesFaraAprobare;

        public Builder(String denumireCurs) {
            this.denumireCurs = denumireCurs;
            this.listaMateriale  =new ArrayList<>();
        }

        public Builder setInregistratAutomat(boolean inregistratAutomat) {
            this.inregistratAutomat = inregistratAutomat;
            return this;
        }

        public Builder setPermiteAccesFaraAprobare(boolean permiteAccesFaraAprobare) {
            this.permiteAccesFaraAprobare = permiteAccesFaraAprobare;
            return this;
        }

        public Builder adaugaMaterial(String numeMaterial) {
            this.listaMateriale.add(numeMaterial);
            return this;

        }

        public SesiuneCursBuilder build(){
            return new SesiuneCursBuilder(this);
        }

    }

}
