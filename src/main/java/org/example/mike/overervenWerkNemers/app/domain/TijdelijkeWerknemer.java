package org.example.mike.overervenWerkNemers.app.domain;

public class TijdelijkeWerknemer extends Werknemer implements Comparable{
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

    @Override
    public int compareTo(Object otherObject) {
        Werkneembaar otherWerknemer = (Werkneembaar) otherObject;
        int letterDifference = 0;
        int letterIndex = 0;
        while((letterDifference == 0) && (letterIndex <= 15)) {
            //see if the letter at current index is different, starts at 0
            letterDifference = this.getNaam().charAt(letterIndex) - otherWerknemer.getNaam().charAt(letterIndex);

            //if not the same same give either negative or positive number to ordering
            if(!(letterDifference == 0)){
                return letterDifference;}
            //if same check next letter
            else{
                letterIndex = letterIndex + 1;
            }
        }
        return letterDifference;
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
