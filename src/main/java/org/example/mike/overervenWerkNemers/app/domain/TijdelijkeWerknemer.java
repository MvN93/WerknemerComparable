package org.example.mike.overervenWerkNemers.app.domain;

public class TijdelijkeWerknemer extends Werknemer{
    private int aantalUren;
    private int uurloon;

    public TijdelijkeWerknemer(int id, String naam, int aantalUren, int uurloon) {
        super(id, naam);
        setAantalUren(aantalUren);
        setUurloon(uurloon);
    }

    public int getSalaris()
    {
        int salaris = aantalUren * uurloon;
        return salaris;
    }

    public String toStringRepresentatie() {
        return "TijdelijkeWerknemer{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", aantalUren=" + aantalUren +
                ", uurloon=" + uurloon +
                '}';
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
