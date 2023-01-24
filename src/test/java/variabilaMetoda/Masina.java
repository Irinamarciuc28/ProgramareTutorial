package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String Marca;
    public String Model;
    public Integer CaiPutere;


    @Test
    public void MetodaTest(){

        PrezentareMasina( "Opel","Astra", 100);
        PrezentareMasina("Audi","A3", 300);
        PrezentareMasina("Dacia","Sandero",50);

    }
    //o metoda poate sau nu sa primeasca parametrii;
    public void PrezentareMasina(String Par1, String Par2, Integer Par3){
        Marca = Par1;
        Model = Par2;
        CaiPutere = Par3;

        System.out.println(Marca);
        System.out.println(Model);
        System.out.println(CaiPutere);




    }
}
