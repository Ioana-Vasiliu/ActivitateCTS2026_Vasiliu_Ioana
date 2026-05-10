package ExercitiiAdapter.STB.classes;

public class AdapterAbonament extends AbonamentTerestru{
    private AbonamentSubteran abonamentSubteran;


    public AdapterAbonament(AbonamentSubteran abonamentSubteran) {
        super(String.valueOf(abonamentSubteran.getNrLuni()),abonamentSubteran.getPret());
        this.abonamentSubteran = abonamentSubteran;
    }

    @Override
    public void genereazaAbonamentTerestru() {
        abonamentSubteran.genereazaAbonamentSubteran();
    }
}
