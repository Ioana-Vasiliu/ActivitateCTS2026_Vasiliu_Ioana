package acs.ase.ro.bautura.classes;

import java.util.List;

public interface IBautura {
    void preparare();
    String getDetalii();
    double getPret();
    List<String> getIngrediente();
}
