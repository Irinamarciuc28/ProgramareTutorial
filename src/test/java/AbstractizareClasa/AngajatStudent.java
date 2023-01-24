package AbstractizareClasa;

import AbstractizareInterfete.InterfaceAngajat;
import AbstractizareInterfete.InterfaceStudent;
import AbstractizareInterfete.Persoana;

public class AngajatStudent extends Persoana implements InterfaceAngajat, InterfaceStudent {
    public AngajatStudent(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul student munceste");

    }

    @Override
    public void primesteSalara() {
        System.out.println("Angajatul student primeste salar");

    }

    @Override
    public void mergeAcasa() {
        System.out.println("Angajatul student merge acasa");

    }

    @Override
    public void invata() {
        System.out.println("Angajatul student invata");
    }

    @Override
    public void doarme() {
        System.out.println("Angajatul student doarme");

    }
}


