package SingletonRegistry.classes;

import SingletonSimple.classes.ACuptor;
import SingletonSimple.classes.Comanda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cuptor extends ACuptor {

    private int gradeMaxime;
    private static HashMap<String,Cuptor> registry = new HashMap<>();
    private  List<Comanda> listaComenzi = new ArrayList<>();

    private Cuptor(int gradeMaxime) {
        this.gradeMaxime = gradeMaxime;
    }

    public static synchronized Cuptor getInstance(String id,int gradeMaxime){
        if(!registry.containsKey(id)){
            registry.put(id,new Cuptor(gradeMaxime));
        }
        return registry.get(id);
    }



    @Override
    public int getGradeMaxime() {
        return this.gradeMaxime;
    }

    @Override
    public int getTimpAsteptare() {
        int total = 0;
        for (Comanda c : listaComenzi){
            total += c.getTimpGatire();
        }
        return  total;

    }

    @Override
    public void afisareComenziAsteptare() {
        for (Comanda c : listaComenzi){
            System.out.println(c);
        }

    }

    @Override
    public void addComanda(Comanda c) {
        if(c.getGradeGatire()<= this.gradeMaxime){
            listaComenzi.add(c);
        }
        else{
            System.out.println("Gradele sunt prea mari pentru coptor!");
        }
    }

}
