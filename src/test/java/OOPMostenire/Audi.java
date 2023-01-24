package OOPMostenire;

import java.util.List;

public class Audi extends Masina {

    public List<String> DotariExterioare;
    public List<String> DotariInterioare;



    public Audi(String brand, String model, String transmisie, Integer pret,List<String> DotariExterioare, List<String> DotariInterioare ) {


        super(brand, model, transmisie, pret);
        this.DotariExterioare=DotariExterioare;
        this.DotariInterioare=DotariInterioare;
    }


    public void InfoAudi(){
        InfoMasina();
        System.out.println("Dotari Interioare sunt"+DotariInterioare);
        System.out.println("DotariExterioar"+DotariExterioare);
    }

    public void InfoDacia() {
        InfoMasina();
        System.out.println("Dotari Interioare este" + DotariInterioare);
        System.out.println("Dotarile Exterioare sunt" + DotariExterioare);
    }

     //Suprascriem metoda de conducere
    public void ConducMasina(){
        System.out.println("Audi se conduce pe dreapta");
    }
}
