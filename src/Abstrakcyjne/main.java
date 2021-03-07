package Abstrakcyjne;

public class main {
    public static void main (String[] args){

        //Zadanie 1/4
        System.out.println("Zadanie 1/4");
        Pies pies = new Pies();
        pies.wiek();
        pies.rasa();
        pies.badzMilutki();
        pies.bawSie();

        //Zadanie 2
        System.out.println("Zadanie 2");
        Samochod samochod = new Samochod();
        samochod.jedz();
        samochod.ZatrzymajSie();

        //Zadanie 5
        System.out.println("Zadanie 5");
        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println("\nPole = " + kwadrat.obliczObwod());
        System.out.println("Obwod =" + kwadrat.obliczPole());

        //Zadanie 3
        System.out.println("Zadanie 3");
        PodajRocznikWina PodajRocznikWina = new PodajRocznikWina();
        PodajRocznikWina.rocznik();
        PodajRocznikWina.Jestotwierane();
        PodajRocznikWina.Jestnalewane();
        PodajRocznikWina.Jestpite();
        PodajRocznikWina.Smakuje();
    }
}
