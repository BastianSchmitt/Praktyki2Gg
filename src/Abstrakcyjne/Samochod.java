package Abstrakcyjne;

public class Samochod implements Pojazd{
    public Samochod() {
        super();
    }

    @Override
    public void jedz() {
        System.out.println("Jedzie");
    }

    @Override
    public void ZatrzymajSie() {
        System.out.println("Zatrzymuje sie");
    }
}
