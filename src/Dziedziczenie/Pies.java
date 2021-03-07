package Dziedziczenie;

public class Pies extends Zwierze {
    private String siersc;
    private int dlugoscOgona;

    public Pies(int wiek, int ilosckonczyn, String nazwa, String siersc, int dlugoscOgona){
        super(wiek, ilosckonczyn, nazwa);
        this.siersc = siersc;
        this.dlugoscOgona = dlugoscOgona;
    }

    @Override
    public void DajGlos() {
        System.out.println("Hau Hau");
    }
    public String getSiersc(){
        return siersc;
    }
    public void setSiersc(String siersc){
        this.siersc = siersc;
    }
    public int getDlugoscOgona(){
        return dlugoscOgona;
    }
    public void setDlugoscOgona(int DlugoscOgona){
        this.dlugoscOgona = dlugoscOgona;
    }

}
