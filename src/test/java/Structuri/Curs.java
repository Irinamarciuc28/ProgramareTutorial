package Structuri;

import org.testng.annotations.Test;

public class Curs {
    //Structurile in programare sunt de doua feluri:alternative si repetitive
    //Structuri alternative se pot realiza folosind:"if" (then) else, switch case
    //Structuri repetitive (LOOP) se pot realiza folosind:for, while,do while, for each

    @Test

    public void MetodaTest(){
        //VerificareNumar(15);
        //VerificareNumar (3);
        //VerificareNumar(18);
        //VerificareNumar(-1);
        VerificareNumarParPozitiv(4);
        VerificareNumarParPozitiv(5);
        VerificareNumarParPozitiv(-2);
        VerificareNumarParPozitiv(-3);
        VerificareNumarParPozitiv(0);
        ZiuaSaptamana(4);
        ZiuaSaptamana(2);
    }
    //verificam daca un numar este mai mare decat 10

    public void VerificareNumar(Integer Numar){
        if (Numar >10){
            System.out.println("Numarul este mai mare ca 10.");
        }
        else {
            System.out.println("Numarul nu este mai mare decat 10.");
        }

    }
    //Verificam daca un numar este par si pozitiv.
    public void VerificareNumarParPozitiv(Integer Numar){
        if (Numar >0){
            if (Numar %2==0){
                System.out.println("Numarul  "+Numar+"este par si pozitiv");

            }
             if (Numar<0){
                System.out.println("Numarul "+Numar+"este impar si pozitiv");
            }
            else {
                System.out.println("Numarul "+Numar+"este egal cu 0.");
            }
        }
        if (Numar== 0 ) {
            System.out.println("Numarul "+Numar+" este egal cu 0.");
        }
        else if (Numar!=0){
            if (Numar %2==0){
                System.out.println("Numarul "+Numar+" este par si negativ");

            }
            else{
                System.out.println("Numarul "+Numar+" este impar si negativ");
            }

        }
        if (Numar == 0)
        {
            System.out.println("Numarul "+Numar+"este zero");
        }
        }

    public void ZiuaSaptamana(Integer Numar) {
        switch (Numar) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
            System.out.println("Marti");
            break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
        }
    }
}

//Facem o metoda cu Switch Case
//Afisam ziua curenta din saptamana


