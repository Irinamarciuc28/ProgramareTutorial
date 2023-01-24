package Tema;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MuzicaTest {

    @Test


    public void MetodaTest() {
        //Declaram un obiect de tipul X
        List<String>GenuriTipurideMuzica = Arrays.asList("jazz","rock","blues","usoara");
        Muzica TipurideMuzica = new Muzica ("Celine", "chitara",GenuriTipurideMuzica,90);
        TipurideMuzica.InfoMuzica();


    }


    }

