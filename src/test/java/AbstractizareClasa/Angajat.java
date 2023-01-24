package AbstractizareClasa;


import AbstractizareInterfete.AngajatStudent;

public abstract class Angajat extends Persona {

public Angajat(String nume, String adresa, Integer varsta){
    super (nume, adresa, varsta);
}
    @Override
    public void munceste() {

    }
}
