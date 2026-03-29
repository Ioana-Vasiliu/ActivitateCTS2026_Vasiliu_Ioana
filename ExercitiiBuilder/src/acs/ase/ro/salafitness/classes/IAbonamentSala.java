package acs.ase.ro.salafitness.classes;

import java.util.List;

//CERINTA
//In cadrul unei aplicatii pentru administrarea salilor de fitness, se doreste implementarea unui modul pentru crearea unor obiecte de tip AbonamentSala.
// Pentru fiecare abonament se cunosc denumirea abonamentului si lista serviciilor incluse. De asemenea, un abonament poate avea optional urmatoarele caracteristici:
//sa includa acces la piscina;
//sa includa acces nelimitat in weekend.
//La crearea unui abonament, anumite servicii sunt incluse implicit, iar altele pot fi adaugate optional.
// Dupa ce obiectul de tip AbonamentSala a fost creat, nu se mai pot adauga servicii noi si nu se mai pot modifica optiunile alese initial.

public interface IAbonamentSala {
    List<String> getServiciiIncluse();
    void afiseazaDetaliiAbonament();
    void adaugaServiciu(String numeServiciu);
}
