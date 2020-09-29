package org.example.mike.overervenWerkNemers.app.domain;

public abstract class Werknemer implements Werkneembaar, Comparable{
    protected int id;
    protected String naam;

    Werknemer(int id, String naam)
    {
        setId(id);
        setNaam(naam);
    }

    public boolean equals(Object otherObject){
        if(otherObject == null){return false;}
        if(!(otherObject instanceof Werknemer)){return false;}
        Werknemer otherWerknemer = (Werknemer) otherObject;
        return this.getId() == otherWerknemer.getId();
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
            else if((letterIndex < this.getNaam().length()) && !(letterIndex < otherWerknemer.getNaam().length())){
                return 1; //kortere naam komt dan eerder te staan
            }
            else if(!(letterIndex < this.getNaam().length()) && (letterIndex < otherWerknemer.getNaam().length())){
                return -1; //kortere naam komt dan eerder te staan
            }
            else{return 0;}
        }
        return letterDifference;
    }

    public String toStringRepresentatie(){
        return "id: " + id + ", naam: " + naam;
    }

    public abstract int getSalaris();

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
}
