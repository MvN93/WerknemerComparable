package org.example.mike.overervenWerkNemers.app.domain;

public abstract class Werknemer implements Werkneembaar {
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
