package org.example.mike.overervenWerkNemers.app.domain;

public class VasteWerknemer extends Werknemer{
    public static final int MINIMUM_SALARIS_SCHAAL = 4;
    public static final int MAXIMUM_SALARIS_SCHAAL = 20;
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
        if(salarisSchaal < MINIMUM_SALARIS_SCHAAL || salarisSchaal > MAXIMUM_SALARIS_SCHAAL){
            throw new OngeldigeSalarisSchaalException("De ingevoerde salarisschaal is ongeldig. Let op geldige schalen lopen van " + MINIMUM_SALARIS_SCHAAL + " tot " + MAXIMUM_SALARIS_SCHAAL + ".");
        }
        this.salarisSchaal = salarisSchaal;
    }

    public int getSalarisSchaal() {
        return salarisSchaal;
    }


}
