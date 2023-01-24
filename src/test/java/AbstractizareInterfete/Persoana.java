package AbstractizareInterfete;

public abstract class Persoana {

    //Abdstractizare - conceptul prin care definim comportamentul unei clase
    //Acest concept se poate realiza in Java cu interfete sau clase abstracte
    //Interfata - colectie de metode care sunt doar abstracte (=nu au body)
    //Recunoastem o interfata dupa cuvantul Interface
    //Intr-o interfata nu avem un constructor =>nu putem face un obiect
    //Clasa care implementeaza interfata =>trebuei sa implementeze toate metodele interfetei
    //O clasa abstracta poate sa implementeze o interfata
    //O clasa poate sa implementeze n interfete
    //O interfata poate sa mosteneasca o alta interfata
    //toate elementele dintr-o interfata sunt publice


    private String nume;
    private String adresa;
    private Integer Varsta;

    public Persoana(String nume, String adresa, Integer varsta) {
        this.nume = nume;
        this.adresa = adresa;
        Varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setVarsta(Integer varsta) {
        Varsta = varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public Integer getVarsta() {
        return Varsta;
    }


    public abstract void munceste();
}
