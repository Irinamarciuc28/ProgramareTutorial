package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MancareTest {
    @Test

    public void MetodaTest(){

        //Declaram un obiect de tipul X

        List<String> IngredienteSupaPui= Arrays.asList("apa", "morvcovi","pui","taitei");
        Mancare SupaPui = new Mancare("SupaDePui", "Supa de casa", IngredienteSupaPui, 400);
        SupaPui.InfoMancare();

        List<String> IngredienteSarmale= Arrays.asList("carne", "varza","sare","orez");
        Mancare Sarmale = new Mancare("Sarmale", "Traditionala", IngredienteSarmale, 1000);
        Sarmale.InfoMancare();

        List<String> IngredienteSarmalePost= Arrays.asList("ciuperci", "varza","sare","orez");
        Mancare SarmalePost = new Mancare("SarmalePost", "Traditionala", IngredienteSarmalePost, 200, true);
        SarmalePost.InfoMancare();

    }

}
