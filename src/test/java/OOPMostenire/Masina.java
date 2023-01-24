package OOPMostenire;

public class Masina {

    //OOP Object Oriented Programming
    //4 concepte = Mostenire/Abstractizare/Incapsulare/Polimorfism
    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa (Bunici <= Nepoti)
    //Clasa care mosteneste (nepotii) se  numeste clasa copil
    //Clasa care e mostenita (bunicii) se numeste clasa parinte
    //Mostenirea se face cu cuvantul 'extends'
    //In Java o clasa poate sa mosteneasca o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa rezulta trebuie sa apelam prima data constructorul din parinte
    //In momentul in care o clasa mosteneste o alta clasa rezulta putem accesa orice variabila/metoda
    //principii SOLID de cautat

    //Aplicam conceptul de incapsularea datelor
    //Incapsularea datelor = conceptul prin care tinem departe de exterior valorile variabilelor pe care nu vrem sa le modificam
    //private  =  access control care restrictioneaza vizibilitatea variabilei la nivel de clasa unde-i declarata
    //ca  sa accesam / modificam valorile unor variabile private ne folosim de conceptul  get si set


    //Polimorfism =  conceptul prin care o metoda poate avea mai multe forme
    //Polimorfirmul este de 2 tipuri : dinamic (override) si static (overload)
    //Polimerfism dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea mai multe implementari
    //Polimorfismul dinamic se aplica mereu cu mostenirea
    //Polimorfism static = o metoda se poate diferentia prin numarul sau tipul parametrilor

    private String Brand;
    private String Model;
    private String Transmisie;
    private Integer Pret;

    public Masina(String brand, String model, String transmisie, Integer pret) {
        Brand = brand;
        Model = model;
        Transmisie = transmisie;
        Pret = pret;
    }

    //GET SI SET


    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getTransmisie() {
        return Transmisie;
    }

    public Integer getPret() {
        return Pret;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setTransmisie(String transmisie) {
        Transmisie = transmisie;
    }

    public void InfoMasina(){
        System.out.println("Brandul este " + Brand);
        System.out.println("Model este " + Model);
        System.out.println("Transmisie este " + Transmisie);
        System.out.println("Pret este " + Pret);
        System.out.println("Pret este " + Pret);
    }

///Polimorfism dinamic

    public void ConducMasina(){
        System.out.println("Masina se poate conduce");
    }

}
