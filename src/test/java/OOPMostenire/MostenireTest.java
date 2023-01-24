package OOPMostenire;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.zip.Adler32;

public class MostenireTest {

    @Test
    public void MetodTest(){
        //Facem un obiect Dacia
        List<String> DotariExterioareLogan= Arrays.asList("Geamuri electrice", "Aer conditionat");
        Dacia Logan = new Dacia("Dacia","Logan","manuala",10000,"alb Metalizat", DotariExterioareLogan);
        Logan.InfoDacia();
        Logan.CalculPretFinal();
        Logan.ConducMasina();


        List<String> DotariExterioareSandero= Arrays.asList("Geamuri electrice", "Aer conditionat");
        Dacia Sandero = new Dacia("Dacia","Sandero","manuala",10000,"alb", DotariExterioareSandero);
        Sandero.InfoDacia();

        List<String> DotariExterioareDoker= Arrays.asList("Geamuri electrice", "Aer conditionat");
        Dacia Doker = new Dacia("Dacia","Doker","manuala",10000,"alb", DotariExterioareDoker);
        Doker.InfoDacia();

        System.out.println("==obiecteAudi==");
        List<String> DotariExterioareA3= Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariInterioareA3= Arrays.asList("Geamuri electrice", "Aer conditionat");
        Audi A3= new Audi("Audi", "A3","manuala", 14000,DotariExterioareA3, DotariInterioareA3);
        A3.InfoAudi();
        A3.ConducMasina();


        List<String> DotariExterioareQ3= Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariInterioareQ3= Arrays.asList("Geamuri electrice", "Aer conditionat");
        Audi Q3 = new Audi("Audi", "Q3","manuala", 54000,DotariExterioareQ3,DotariInterioareQ3);
        Q3.InfoAudi();

        System.out.println("==obiecteAudi==");
        List<String> DotariExterioareQ7= Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariInterioareQ7= Arrays.asList("Geamuri electrice", "Aer conditionat");
        Audi Q7= new Audi("Audi", "Q7","manuala", 54000,DotariExterioareQ7,DotariInterioareQ7);
        Q7.InfoAudi();

        System.out.println("====obiecteBMW====");
        BMW Seria3= new BMW("BMW", "Seria3","manuala", 24000,true);
        Seria3.InfoBMW();
        Seria3.AfisareMasini("masina");
        Seria3.AfisareMasini(123);

    }
}
