package Dziedziczenie;

public class main {
    public static void main(String[]args){
        //Zadanie 1
        System.out.println("Zadanie 1");
        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println(kwadrat.Pole());
        Prostokat prostokat = new Prostokat(2,5);
        System.out.println(prostokat.Pole());

        //Zadanie2
        System.out.println("Zadanie 2");
        Pies pies = new Pies(2,4,"Reksio","Czarna",20);
        pies.DajGlos();

        //Zadanie 3
        System.out.println("Zadanie 3");
        Spawacz spawacz = new Spawacz(7000,"pełny",true,true);
        spawacz.wykonujePrace();

        //Zadanie 4
        System.out.println("Zadanie 4");
        System.out.println(" Która metoda przysłania metodę z klasy nadrzędnej/superclass?\n methodTwo, methodFour");
        System.out.println(" Która metoda jest ukryta/niewidzialna w klasie B?\nmethodThree i medtodOne");

    }
}
