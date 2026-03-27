package acs.ase.ro.reclama.classes;

public class Reclama implements IReclama,IPrototype{
    private String numeProdusPromovat;
    private int latime;
    private int inaltime;
    private String orasPromovat;

    public Reclama(String numeProdusPromovat, int latime, int inaltime, String orasPromovat) {
        this.numeProdusPromovat = numeProdusPromovat;
        this.latime = latime;
        this.inaltime = inaltime;
        this.orasPromovat = orasPromovat;
    }

    public Reclama() {

    }

    public void setNumeProdusPromovat(String numeProdusPromovat) {
        this.numeProdusPromovat = numeProdusPromovat;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setOrasPromovat(String orasPromovat) {
        this.orasPromovat = orasPromovat;
    }


    @Override
    public String getNumeProdusPromovat() {
        return numeProdusPromovat;
    }

    @Override
    public int getLatime() {
        return latime;
    }

    @Override
    public int getInaltime() {
        return inaltime;
    }

    @Override
    public String getOrasPromovare() {
        return orasPromovat;
    }

    @Override
    public Reclama cloneaza() {
        Reclama reclama= new Reclama();
        reclama.numeProdusPromovat = this.numeProdusPromovat;
        reclama.latime =this.latime;
        reclama.inaltime=this.inaltime;
        reclama.orasPromovat=this.orasPromovat;

        return reclama;
    }

    public String getDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reclama {");
        sb.append("numeProdusPromovat='").append(numeProdusPromovat).append('\'');
        sb.append(", latime=").append(latime);
        sb.append(", inaltime=").append(inaltime);
        sb.append(", orasPromovat='").append(orasPromovat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
