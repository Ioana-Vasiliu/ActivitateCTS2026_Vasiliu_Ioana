package observer.classes;

public interface ISpital {
    void trimiteMesaj(String mesaj);
    void aboneazaPacient(Pacient pacient);
    void dezaboneazaPacient(Pacient pacient);
}
