package org.example.mike.overervenWerkNemers.app.domain;

public class VasteWerknemer {
    private int id;
    private String naam;
    private int salarisSchaal;

    public VasteWerknemer(int id, String naam, int salarisSchaal) {
        setId(id);
        setNaam(naam);
        setSalarisSchaal(salarisSchaal);
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


