package OOPMostenire;

public class BMW extends Masina{


    public Boolean Semnalizare;

    public BMW(String brand, String model, String transmisie, Integer pret, Boolean Semnalizare) {
        super(brand, model, transmisie, pret);
        this.Semnalizare= Semnalizare;

    }

    public void InfoBMW(){
        InfoMasina();
        System.out.println("Are semnalizare?"+ Semnalizare );

    }

    //Polimorfism static

    public void AfisareMasini(){
        System.out.println("Polimorfism fara parametrii");
    }
    public void AfisareMasini(String Valoare){
        System.out.println("Polimorfism fara parametrii");
    }
    public void AfisareMasini(Integer Valoare){
        System.out.println("Polimorfism fara parametrii");
    }
}
