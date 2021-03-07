package Abstrakcyjne;

public class Pies extends Zwierze implements ZwierzeDomowe {
    @Override
    public void wiek() {
        System.out.println("2");
    }
    @Override
    public void rasa() {
        System.out.println("Terier Rosyjski");
    }
    @Override
    public void badzMilutki() {
        System.out.println("Miły");
    }
    @Override
    public void bawSie() {
        System.out.println("Bawi sie ");
    }
}