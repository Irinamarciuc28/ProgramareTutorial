package AbstractizareInterfete;

public class Student extends Persoana implements InterfaceStudent {
    public Student(String nume, String adresa, Integer varsta) {

        super(nume, adresa, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Studentul munceste");
    }


    @Override
    public void invata() {
        System.out.println("Studentul invata");

    }

    @Override
    public void doarme() {
        System.out.println("Studentul doarme");

    }
}
