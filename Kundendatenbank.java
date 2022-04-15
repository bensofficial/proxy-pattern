import java.util.HashMap;

public class Kundendatenbank implements DatenbankInterface {

    private HashMap<Integer, String> kunden;

    public Kundendatenbank(HashMap<Integer, String> kunden) {
        this.kunden = kunden;
    }

    public String kundenNameGeben(int kundennummer) {
        return kunden.get(kundennummer);
    }

    public void kundenNameEinfuegen(int kundennummer, String name) {
        kunden.put(kundennummer, name);
    }
}
