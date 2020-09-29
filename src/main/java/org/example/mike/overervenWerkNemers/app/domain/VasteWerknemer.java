package org.example.mike.overervenWerkNemers.app.domain;

public class VasteWerknemer extends Werknemer implements Comparable{
    private int salarisSchaal;

    public VasteWerknemer(int id, String naam, int salarisSchaal) {
        super(id, naam);
        setSalarisSchaal(salarisSchaal);
    }

    public int getSalaris()
    {
        int salaris = salarisSchaal * 1000;
        return salaris;
    }

    @Override
    public int compareTo(Object otherObject) {
        Werkneembaar otherWerknemer = (Werkneembaar) otherObject;
        int letterDifference = 0;
        int letterIndex = 0;
        while((letterDifference == 0) && (letterIndex <= 15)) {
            //zodat we geen exception krijgen van het vergelijken van kortere en langere namen
            if(letterIndex < this.getNaam().length() && letterIndex < otherWerknemer.getNaam().length()){
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
            else if((letterIndex <= this.getNaam().length()) && !(letterIndex <= otherWerknemer.getNaam().length())){
                return -1; //kortere naam komt dan eerder te staan
            }
            else if(!(letterIndex <= this.getNaam().length()) && (letterIndex <= otherWerknemer.getNaam().length())){
                return 1; //kortere naam komt dan eerder te staan
            }
            else{return 0;}
        }
        return letterDifference;
    }

    public String toStringRepresentatie() {
        return "VasteWerknemer{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", salarisSchaal=" + salarisSchaal +
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

    public void setSalarisSchaal(int salarisSchaal) {
        this.salarisSchaal = salarisSchaal;
    }

    public int getSalarisSchaal() {
        return salarisSchaal;
    }


}
