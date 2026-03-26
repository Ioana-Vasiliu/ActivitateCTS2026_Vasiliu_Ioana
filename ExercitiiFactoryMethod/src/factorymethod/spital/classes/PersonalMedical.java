package factorymethod.spital.classes;

public abstract class PersonalMedical implements IPersonalSpital {
    private String nume;
    private int varsta;

    public PersonalMedical(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void descriere() {
        System.out.println("Numele personalului medical este : " + this.nume + " si are varsta : " + this.varsta );
    }
}
