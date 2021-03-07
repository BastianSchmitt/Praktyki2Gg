package Abstrakcyjne;

abstract public class Wino {
    abstract void Smakuje();
    abstract void Jestnalewane();
    void Jestpite(){
        System.out.println("Jest pite");
    }
    void Jestotwierane(){
        System.out.println("Jest otwierane");
    }
}