import java.util.LinkedList;

public class DatenbankProxy implements DatenbankInterface{
    private boolean eingeloggt;
    private LinkedList<Integer> mitarbeiter;
    private Kundendatenbank kundendatenbank;

    public DatenbankProxy(LinkedList<Integer> mitarbeiter, Kundendatenbank Kundendatenbank) {
        this.mitarbeiter = mitarbeiter;
        this.kundendatenbank = kundendatenbank;
        eingeloggt = false;
    }

    // TODO: Der Mitarbeiter soll eingeloggt werden, wenn die ID in der Liste einhalten ist.
    // Tipp: mitarbeiter.contains(id)
    public void login(int id) { }

    // TODO: Wenn ein Mitarbeiter eingeloggt ist, soll dieser ausgeloggt werden.
    public void logout() { }

    // TODO
    public boolean istEingeloggt() {
        return false;
    }

    // TODO: Wenn jemand eingeloggt ist, soll die entsprechende Methode in der Kundendatenbank aufgerufen werden.
    public String kundenNameGeben(int kundennummer) {
        return "";
    }

    // TODO: Wenn jemand eingeloggt ist, soll die entsprechende Methode in der Kundendatenbank aufgerufen werden.
    public void kundenNameEinfuegen(int kundennummer, String name) { }
}
