package ObiectConstructor;

import java.util.List;

public class Telefon {

    public String Brand;
    public String Model;

    public Integer AnFabricatie;

    public String SistemOperare;
    public List<String> Caracteristici;
    public Double Pret;

    public Telefon(String brand, String model, Integer anFabricatie, String sistemOperare, List<String> caracteristici) {
        Brand = brand;
        Model = model;
        AnFabricatie = anFabricatie;
        SistemOperare = sistemOperare;
        Caracteristici = caracteristici;

    }

    public Telefon(String brand, String model, Integer anFabricatie, String sistemOperare, List<String> caracteristici, Double pret) {
        Brand = brand;
        Model = model;
        AnFabricatie = anFabricatie;
        SistemOperare = sistemOperare;
        Caracteristici = caracteristici;
        Pret = pret;
    }

    public void VechimeTelefon() {
        if (AnFabricatie >= 2020) {
            System.out.println("Aproape nou");
        }
        if (AnFabricatie >= 2015 && AnFabricatie <= 2019) {
            System.out.println("uzat");
        }
        if (AnFabricatie <= 2015) {
            System.out.println("vechi");
        }
    }
    public void PretTelefon(){
      if (Pret!=null){
          System.out.println(Pret);
      }
      else{
          System.out.println("Telefonul este de prezentare");
      }
    }

    public void DiscountTelefon(Double Reducere){



        if (Pret!=null){
            Double Diferenta = (Pret*Reducere)/100;
            Double PretNou = Diferenta - Pret;
            System.out.println("Noul pret al telefonului este"+PretNou);
        }
        else{
            System.out.println("Telefonul este de prezentare");
        }

    }
}