package ValueType;

import org.testng.annotations.Test;

public class ValueInt {
    public int Variabila1;

    public Integer Variabila2;

    public double Variabia3;

    public Double Variabila4;
    @Test
    public void MetodaTest(){
        Variabila1 = 5;
        Variabila2 = 10;
        System.out.println(Variabila1);
        Calcul(Variabila1);
        System.out.println(Variabila1);

        Jucarie Papusa = new Jucarie("Papusa");
        Papusa.Info();
        Papusa.setNume("Masina");
        Papusa.Info();
    }

    public void Calcul (Integer x){
        x = x+1;
        System.out.println(x);
    }
}
