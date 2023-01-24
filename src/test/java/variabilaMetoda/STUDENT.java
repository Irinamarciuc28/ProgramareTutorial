package variabilaMetoda;

import org.testng.annotations.Test;

public class STUDENT {

    //Asta este un comentariu
    //Clasa = sablon care contine variabile si metode
    //Intr-un fisier Java putem avea mai multe clase diferentiate prin numele lor (nu este un lucru bun sa ai mai multe clase)
    //Sa ai mai multe classe intr-un fisier
    //o clasa trebuie sa aiba un nume
    //o clasa se recunoaste dupa cuvantul class
    //tot timpul o clasa trebuie sa fie publica (vizibil peste tot)
    //variabila =atributul unei clase
    //variabilele sunt de doua feluri Global si Local
    //variabila globala =este vizibila peste tot in program
    //variabila locala= este vizibila doar in locul unde o declari

    public String Nume;
    public String Prenume;
    public String Adresa;
    public Integer Varsta;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean Este_angajat;


    //Metoda = actiune la nivel de clasa
    //Metodele sunt de doua feluri void (este folosit cand vrei sa vezi tu rezultatul) si return (returneaza raspunsul)


    @Test
    public void PrezentareSTUDENT()
    {
            Nume = "Marciuc";
            Prenume = "Irina";
            Adresa= "Musicescu nr.161";
            Varsta=32;
            Inaltime=1.76;
            Greutate=72.0f;
            Sex='F';
            Este_angajat=true;

             //Print afiseaza pe statatura si ramane pe acelasi rand
            //Println afiseaza si sare la randul yurmator
            //Daca vrem s alegam doua siruri de caractere folosim conceptul de concatenare(+)

            System.out.println("Numele studentului este: " + Nume);
            System.out.println("Prenumele studentului este: " + Prenume);
            System.out.println("Adresa este: " +Adresa);
            System.out.println("Varsta este : " +Varsta);
            System.out.println("Greutatea este:" + Greutate);
            System.out.println ("Sexul este: " + Sex);
            System.out.println ("Studentul este angajat? " + Este_angajat);




    }
    @Test
    public void Adaugare_nume()
    {
      //Declaram o variabila locala
      String Prenume2 = "Cici";
      Nume = "Marciuc";
      Prenume= "Irina";

      System.out.println("Numele complet este: " + Nume+" " + Prenume2 + " " + Prenume);
      System.out.println("Bonusul de Craciun este:" + String.format("%.3f",getBonus()));

    }

    //Facem o metoda cu return
    public Double getBonus()
    {
     Double Bonus = 1.000;
     return Bonus;
    }


}
