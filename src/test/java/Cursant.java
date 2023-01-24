import org.testng.annotations.Test;

public class Cursant {
    //structuri repetitive:for , while ,do while,for each;


    @Test
    public void MetodaTest(){
       // NumereFOR();
        // NumereWhile();
        //NumereDoWhile();
        //NumereDivizibile();
        NumereImapresiDivizibile(50);


    }

    //Afisam primele 10 numere;
    public void NumereFOR(){
       for (Integer index =0; index<10; index++){
           System.out.println(index);
       }
    }






    public void NumereWhile(){
        Integer index=0;
        while (index<10){
            System.out.println(index);
            index++;

        }

    }
    public void NumereDoWhile(){
        Integer index=0;

        do{
            System.out.println(index);
            index++;
        }
        while(index<10);

    }
    //Afisam numere divizibile cu 3(interval 0-20)

    public void NumereDivizibile(){

        for (Integer index= 0; index<20; index++){
            if (index%3==0){
                System.out.println(index);
            }
        }
    }
    //afisam numerele impare si divizibile cu 5 (interval random);
    public void NumereImapresiDivizibile(Integer Capat){
        for(Integer index=0;index <Capat; index++){
            if (index%5==0 && index%2==1){
                System.out.println(index);
            }

        }
    }

}
