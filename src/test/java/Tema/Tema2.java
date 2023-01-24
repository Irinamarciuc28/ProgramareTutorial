package Tema;


import javax.xml.crypto.Data;

public class Tema2 {

    class FirstApp {
        public static void main( String args[]) {
            System.out.println("Hello world!");
        }
    }

    public static void main ( Integer args []){
        System.out.println("Varsta");
    }
    public class Tema {
        public static void main(String[] args) {
            Data currentDate = new Data() {
            };
            System.out.println(currentDate);
        }
    }
    public static void main(String[] args) {
        int result= (2+(3*4)-3)/3;
        System.out.println(result);

    }


public void DoubleNumar(){
            double numar1 = 10.5;
            double numar2 = 20.5;
            double numar3 = 30.5;

            double suma = numar1 + numar2 + numar3;

            System.out.println("Suma celor 3 numere este: " + suma);

    }



    public  void Numar(String[] args) {
        // Declararea variabilelor
        int numar1 = 10;
        int numar2 = 20;
        int produs;

        // Calcularea produsului
        produs = numar1 * numar2;

        // Afisarea rezultatului
        System.out.println("Produsul numerelor " + numar1 + " si " + numar2 + " este: " + produs);
    }

     public class Tema3 {
     public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;

        String result = "Rezultatul calculului este: " + c + " " + "Stiu ca am calculat bine";
        System.out.println(result);
    }
}
}