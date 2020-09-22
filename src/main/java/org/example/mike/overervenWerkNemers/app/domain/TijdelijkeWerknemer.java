package org.example.mike.overervenWerkNemers.app.domain;

public class TijdelijkeWerknemer {
    private int id;
    private String naam;
    private int aantalUren;
    private int uurloon;

    public TijdelijkeWerknemer(int id, String naam, int aantalUren, int uurloon) {
        setId(id);
        setNaam(naam);
        setAantalUren(aantalUren);
        setUurloon(uurloon);
    }

    public int getSalaris()
    {
        int salaris = aantalUren * uurloon;
        return salaris;
    }

    @Override
    public String toString() {
        return "TijdelijkeWerknemer{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", aantalUren=" + aantalUren +
                ", uurloon=" + uurloon +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setAantalUren(int aantalUren) {
        this.aantalUren = aantalUren;
    }

    public int getAantalUren() {
        return aantalUren;
    }

    public void setUurloon(int uurloon) {
        this.uurloon = uurloon;
    }

    public int getUurloon() {
        return uurloon;
    }
}
