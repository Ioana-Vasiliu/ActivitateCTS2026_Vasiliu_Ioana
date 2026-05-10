package ExercitiiAdapter.SalaFitness;

//O sală de fitness folosește deja un sistem intern pentru gestionarea abonamentelor de sală.
// Sistemul știe să lucreze cu obiecte care implementează interfața IAbonamentSala.

//Sala achiziționează un soft nou pentru abonamentele de piscină,
// dar clasele din noul soft nu sunt compatibile cu sistemul existent.
// Se dorește crearea unui nivel intermediar care să permită folosirea unui abonament de piscină
// în sistemul de abonamente de sală, fără modificarea clasei AbonamentPiscina.

public interface IAbonamentSala {
    void activeazaAbonamentSala();
}
