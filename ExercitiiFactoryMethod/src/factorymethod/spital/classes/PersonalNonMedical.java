package factorymethod.spital.classes;

public abstract class PersonalNonMedical implements IPersonalSpital{
    private String nume;
    private int varsta;
    private float vechime;

    public PersonalNonMedical(String nume, int varsta, float vechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.vechime = vechime;
    }

    @Override
    public void descriere() {
        System.out.println("Personalul non-medical are numele : " + this.nume + " si are varsta: " + this.varsta + " si are : " + this.vechime + " ani vechime");
    }
}
