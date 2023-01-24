package AbstractizareInterfete;

public class AngajatStudent extends Persoana implements InterfaceStudent,InterfaceAngajat{
    public AngajatStudent(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void munceste() {
        System.out.println(("Angajatul student invata si munceste"));
    }

    @Override
    public void primesteSalara() {
        System.out.println(("Angajatul student  munceste si primeste salar"));
    }

    @Override
    public void mergeAcasa() {
        System.out.println(("Angajatul student  munceste si merge acasa"));

    }

    @Override
    public void invata() {
        System.out.println(("Angajatul student  invata"));

    }

    @Override
    public void doarme() {
        System.out.println(("Angajatul student  doarme"));

    }


}
