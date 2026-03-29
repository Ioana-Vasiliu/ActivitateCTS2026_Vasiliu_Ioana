package acs.ase.ro.stb.classes;

public class AutobuzLinie {
    private final String model;
    private final String numeSofer;
    private final boolean oprireCapat;
    private final boolean deschideUsile;
    private final String textEcran;


    private AutobuzLinie(Builder builder) {
        this.model = builder.model;
        this.numeSofer = builder.numeSofer;
        this.oprireCapat = builder.oprireCapat;
        this.deschideUsile = builder.deschideUsile;
        this.textEcran = builder.textEcran;
    }

    public String getModel() {
        return model;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public boolean isOprireCapat() {
        return oprireCapat;
    }

    public boolean isDeschideUsile() {
        return deschideUsile;
    }

    public String getTextEcran() {
        return textEcran;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", oprireCapat=").append(oprireCapat);
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", textEcran='").append(textEcran).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{
        private final String model;
        private final String numeSofer;

        private boolean oprireCapat = false;
        private boolean deschideUsile = false;
        private String textEcran = "";

        public Builder(String model, String numeSofer) {
            this.model = model;
            this.numeSofer = numeSofer;

        }


        public Builder setOprireCapat(boolean oprireCapat) {
            this.oprireCapat = oprireCapat;
            return this;
        }

        public Builder setDeschideUsile(boolean deschideUsile) {
            this.deschideUsile = deschideUsile;
            return this;
        }

        public Builder setTextEcran(String textEcran) {
            this.textEcran = textEcran;
            return this;
        }

        public AutobuzLinie build(){
            return new AutobuzLinie(this);
        }

    }

}
