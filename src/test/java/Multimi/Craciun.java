package Multimi;

import org.testng.annotations.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Craciun {
    @Test
    public void MetodaTest (){
       // MultimeNumeArray();
        //MultimeNumeLista();
       // MultimeValori();
        TariOrase();

    }

    //Array
    public void MultimeNumeArray(){
        String[] NumeCursanti = new String[6];
        NumeCursanti[0]="Marcica";
        NumeCursanti[1]="Andreea";
        NumeCursanti[2]="Alex";
        NumeCursanti[3]="Ionela";
        NumeCursanti[4]="Dan";
        NumeCursanti[5]="Maria";
        NumeCursanti[6]="Bogdan";
        for(Integer index=0; index<NumeCursanti.length; index++){
            System.out.println(NumeCursanti[index]);

        }
    }

    //Lista
    public void MultimeNumeLista() {
        List<String> MultimeCursanti = new ArrayList<>();
        MultimeCursanti.add("Daniela");
        MultimeCursanti.add("Liliana");
        MultimeCursanti.add("Alex");
        MultimeCursanti.add("Raul");
        for(Integer index=0; index<MultimeCursanti.size(); index++) {
            System.out.println(MultimeCursanti.get(index));

        }
    }

//hashmap se foloseste cand vrem sa definim un comportament;functioneaza dupa ideea cheia = valoare
//key = value

    public void MultimeValori(){
    //fotbal, cana, acadea

    HashMap<String,String>Obiecte=new HashMap<>();
    Obiecte.put("Sport","Fotbal");
    Obiecte.put("Obiect","Cana");
            Obiecte.put("Dulciuri", "acadea");
    for (String Key: Obiecte.keySet()){
        System.out.println (Key+ " "+Obiecte.get(Key));
    }

    }
    //Tari Orase
    public void TariOrase(){
        List <String>OraseRomania = new ArrayList<>();
        OraseRomania.add("Timisoara");
        OraseRomania.add ("Valcea");
        OraseRomania.add ("Oradea");
        List<String>OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Milano");
        OraseItalia.add("Venezia");
        List<String>OraseSpania = new ArrayList<>();
        OraseSpania.add("Madrid");
        OraseSpania.add("Barcelona");
        OraseSpania.add("Valencia");

        HashMap<String,List<String>>Tari = new HashMap<>();

        Tari.put("Romania", OraseRomania);
        Tari.put("Italia", OraseItalia);
        Tari.put("Spania",OraseSpania);
        for (String Key: Tari.keySet()) {
            System.out.println(Key + " " + Tari.get(Key));
        }


    }
}