package org.example.mike.overervenWerkNemers.app.domain;

public class Werknemer {
    protected int id;
    protected String naam;

    Werknemer(int id, String naam)
    {
        setId(id);
        setNaam(naam);
    }

    public int getSalaris()
    {
        return 0;
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
}
