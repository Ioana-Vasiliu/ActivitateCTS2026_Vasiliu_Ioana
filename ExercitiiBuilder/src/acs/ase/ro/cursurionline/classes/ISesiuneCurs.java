package acs.ase.ro.cursurionline.classes;

import java.util.List;

//CERINTA

//In cadrul unei aplicatii pentru organizarea cursurilor online, se doreste implementarea unui modul de creare a unor obiecte de tip SesiuneCurs.
// Pentru fiecare sesiune se cunosc denumirea cursului si lista materialelor incluse in sesiune. De asemenea, o sesiune poate avea optional urmatoarele caracteristici:
//sa fie inregistrata automat;
//sa permita accesul liber participantilor fara aprobare.

//La crearea unei sesiuni, anumite materiale sunt incluse implicit, iar altele pot fi adaugate optional.
// Dupa ce obiectul de tip SesiuneCurs a fost creat, nu se mai pot adauga materiale noi si nu se mai pot modifica optiunile alese initial.
// Sa se implementeze acest modul folosind un design pattern adecvat.

public interface ISesiuneCurs {
    List<String> getMateriale();
    void afiseazaDetaliiSesiune();
    void adaugaMaterial(String numeMaterial);
}
