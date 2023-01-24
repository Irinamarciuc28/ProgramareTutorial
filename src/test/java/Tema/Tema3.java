package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tema3 {
    @Test

    public void metodeTest(){
        NumereFor();
        NumereWhile();
    }

    //Afisam primele 10 numere

    public void NumereFor(){
        for (Integer index = 0; index<10;index++){
            System.out.println(index);
        }
    }

    public void NumereWhile(){
        Integer index=0;
                while(index<10){
                    System.out.println(index);
                    index++;
                }
    }



    public void SupadePui(){
        List<String> Ingrediente = new ArrayList<>();
        Ingrediente.add("Pui");
        Ingrediente.add ("Patrunjel");
        Ingrediente.add ("Telina");
        List<String> Reteta = new ArrayList<>();
        Reteta.add("Bunica");
        Reteta.add("Televizor");
        Reteta.add("Mama");
        List<String>Cumparaturi = new ArrayList<>();
        Cumparaturi.add("Oala");
        Cumparaturi.add("Aragaz");
        Cumparaturi.add("Tigaie");

        HashMap<String,List<String>> SupadePui = new HashMap<>();

        SupadePui.put("Pui", Ingrediente);
        SupadePui.put("Bunica", Reteta);
        SupadePui.put("Aragaz",Cumparaturi);
        for (String Key: SupadePui.keySet()) {
            System.out.println(Key + " " + SupadePui.get(Key));
        }


    }
}
