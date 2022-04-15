public class Applikation {
    public static void main(String[] args) {
        HashMap<Integer, String> kunden = new HashMap<>();
        kunden.put(1, "Helmut");
        kunden.put(2, "Alfons");
        kunden.put(3, "Stephan");
        kunden.put(4, "Bernd");
        kunden.put(5, "Pramod");
        kunden.put(6, "Jan Philip");
        kunden.put(7, "Matthias");
        kunden.put(8, "Evgeny");

        LinkedList<Integer> mitarbeiter = new LinkedList<>();
        mitarbeiter.add(934543895);
        mitarbeiter.add(37984283);

        DatenbankProxy datenbank = new DatenbankProxy(mitarbeiter, new Kundendatenbank(kunden));

        datenbank.kundenNameGeben(1);
        datenbank.login(37984283);
        datenbank.kundenNameGeben(1);
    }
}
