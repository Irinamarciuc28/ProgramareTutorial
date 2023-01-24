package Tema;

import org.testng.annotations.Test;

public class Tema1 {

    //Definesc cateva atribute pentru un calculator
    public String Nume;
    public String Model;
    public String Windows;
    public String Culoare;
    public String Forma;

    @Test
    public void PrezentareTema1()
    {
        Nume = "Calculator";
        Model = "Patrat";
        Windows = "Pentium";
        Culoare = "Gri";
        Forma = "Rotund";

        System.out.println("Nume calculatorului este: " + Nume);
        System.out.println("Modelul calculatorului este: " +Model);
        System.out.println("Windowsul calculatorului este: " +Windows );
        System.out.println("Culoarea calculatorului este:"+ Culoare);
        System.out.println("Forma calculatorului este:"+Forma);

    }
    @Test
    public void AdaugareNume()
    {
        String Prenume2= "Laptop ";
        Nume = "Calculator2 ";

        System.out.println("Numele complet este: "+Nume+Prenume2+Prenume2);
        System.out.println("Bonusul de Craciun este:" + String.format("%.3f",getBonus()));
    }
    public Double getBonus()
    {
        Double Bonus = 1.000;
        return Bonus;
    }


}
