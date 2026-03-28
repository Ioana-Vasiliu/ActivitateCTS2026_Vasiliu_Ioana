package SingletonSimple.classes;

import java.util.ArrayList;
import java.util.List;

public class Cuptor extends ACuptor{
    private int gradeMaxime;
    private List<Comanda>listaComenzi = new ArrayList<>();

    private static Cuptor instance = null;

    private Cuptor(int gradeMaxime) {
        this.gradeMaxime = gradeMaxime;

    }

    public static synchronized Cuptor getInstance(int gradeMaxime){
        if(instance==null){
            instance =  new Cuptor(gradeMaxime);
        }
        return instance;
    }


    @Override
    public int getGradeMaxime() {
        return this.gradeMaxime;
    }

    @Override
    public int getTimpAsteptare() {
        int total = 0;
        for(Comanda c : listaComenzi){
            total += c.getTimpGatire();
        }
        return total;
    }

    @Override
    public void afisareComenziAsteptare() {
        for (Comanda c : listaComenzi){
            System.out.println(c);
        }

    }

    @Override
    public void addComanda(Comanda c) {
        if(c.getGradeGatire() <= this.gradeMaxime){
            listaComenzi.add(c);

        }else {
            System.out.println("Comanda depaseste gradele maxime ale cuptorului!");
        }
    }
}
