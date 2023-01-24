package AbstractizareInterfete;

import org.testng.annotations.Test;

public class InterfaceTest {
      @Test
    public void metodaTest(){
         Angajat Angajat1 =  new Angajat("Ionut", "Adresa Test", 40);
         Angajat1.munceste();

         Student student1 = new Student("Delia", "Adresa", 20);
         student1.invata();

         AngajatStudent Angajatstudent = new AngajatStudent("Maria","adresa", 20 );
          Angajatstudent.munceste();
          Angajatstudent.invata();
      }

}
