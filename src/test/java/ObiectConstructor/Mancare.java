package ObiectConstructor;

import java.util.List;

public class Mancare {

    //Constructor are rolul sa initializeze variabilele unei clase
    //Constructor are mereu acelasi nume cu clasa
    //Intr-o clasa putem sa avem o multime de constructori(delimitati prin numar/tip parametri)
    //De cele mai multe ori constructorul este public
    //Daca intr-o clasa nu am declarat un costructor =>exista unul by default care nua re parametri
    //Obiectul = instanta unei clase
    //Dintr-o clasa putem face o multime de obiecte
    //Obiectele se diferentiaza prin numele lor
    //In momentul in care initializam un obiect => se initializeaza constructorul clasei


    public String Nume;
    public String Descriere;
    public List <String> Ingrediente;
    public Integer Calorii;
    public Boolean DePost;

    public Mancare(String nume, String descriere, List<String> ingrediente, Integer calorii, Boolean dePost) {
        Nume = nume;
        Descriere = descriere;
        Ingrediente = ingrediente;
        Calorii = calorii;
        DePost = dePost;
    }

    //Declaram un Constructor cu parametri
    public Mancare(String Nume, String Descriere, List<String> Ingrediente, Integer Calorii) {
        this.Nume =Nume;
        this.Descriere=Descriere;
        this.Ingrediente=Ingrediente;
        this.Calorii=Calorii;



    }
    public void InfoMancare(){
        System.out.println("Numele mancarii este"+Nume);
        System.out.println("Descrierea mancarii este "+ Descriere);
        System.out.println("Ingredientele pentru mancare sunt" + Ingrediente);
        for (Integer index =0 ; index <Ingrediente.size();index ++){
            System.out.println(Ingrediente.get(index));
        }
        System.out.println("Caloriile pentru mancare sunt"+ Calorii);
        if (DePost !=null&& DePost){
            System.out.println("Mancarea este de post"+ DePost);
        }
    }

  }

