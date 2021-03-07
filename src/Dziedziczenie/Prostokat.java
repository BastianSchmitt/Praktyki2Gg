package Dziedziczenie;

public class Prostokat extends Figura {
    private double bokB;
    public Prostokat(double bokA, double bokB){
        super(bokB);
        this.bokB = bokB;
    }

    @Override
    public double Pole() {
        return super.getBokA() *bokB;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }
}

