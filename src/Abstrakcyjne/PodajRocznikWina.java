package Abstrakcyjne;

public class PodajRocznikWina extends Wino {
    void rocznik(){
        System.out.println("Rocznik to 1990");
    }

    @Override
    void Smakuje() {
        System.out.println("Smakuje");
    }

    @Override
    void Jestnalewane() {
        System.out.println("Jest nalewane");

    }
}