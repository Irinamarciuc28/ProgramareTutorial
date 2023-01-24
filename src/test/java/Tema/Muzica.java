package Tema;

import java.util.List;

public class Muzica {

    //Clasa Album cu mai multe obiecte (genuri de muzica)- 4-5 obiecte
    //Ex: pret standard  si inac unul pe care il faci cadou,sau cu reducere etc
    //2 -3 constructori si mai multe obiecte

    public String NumeCantaret;
    public String Instrument;
    public List <String> GenMuzical;
    public Integer DurataMelodie;
    public Boolean Simfonica;

    public Muzica(String NumeCantaret, String Instrument, Integer DurataMelodie) {
        NumeCantaret = NumeCantaret;
        Instrument = Instrument;
        GenMuzical = GenMuzical;
        DurataMelodie = DurataMelodie;
        Simfonica = Simfonica;
    }

    //Declaram un Constructor cu parametri
    public Muzica(String NumeCantaret, String Instrument, List<String> GenMuzical, Integer DurataMelodie) {
        this.NumeCantaret = NumeCantaret;
        this.Instrument = Instrument;
        this.GenMuzical = GenMuzical;
        this.DurataMelodie = DurataMelodie;
    }

    public Muzica(String numeCantaret, String instrument, List<String> GenMuzical) {
    }

    public void InfoMuzica(){
        System.out.println("Numele cantaretului este"+NumeCantaret);
        System.out.println("Tipuri de instrumente sunt"+ Instrument);
        System.out.println("Genuri muzicale  sunt" + GenMuzical );
        for (Integer index = 0; index <GenMuzical.size(); index ++){
            System.out.println(GenMuzical.get(index));
        }
        System.out.println("Durata melodieiei este"+ DurataMelodie);
        if (Simfonica !=null&& Simfonica){
            System.out.println("Muzica este Simfonica");
        }
    }
}