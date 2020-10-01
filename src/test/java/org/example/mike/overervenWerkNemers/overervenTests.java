package org.example.mike.overervenWerkNemers;


import org.example.mike.overervenWerkNemers.app.domain.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class overervenTests {

    @Test
    void exceptionVasteWerknemerSchaal(){
        Werkneembaar vasteWerknemer1 = new VasteWerknemer(1, "Sjoerd", 1);
    }

    @Test
    void exceptionVasteWerknemerSchaalThrowAndCatch(){
        System.out.println("Methode Begonnen");
        try{
            Werkneembaar vasteWerknemer1 = new VasteWerknemer(1, "Sjoerd", 1);
            System.out.println("Try succesvol");
        }
        catch(OngeldigeSalarisSchaalException e){
            System.out.println("Ongeldige salarisschaal exception");
        }
        catch(Exception e){
            System.out.println("General exception");
        }
        System.out.println("Methode Afgerond");

    }

    @Test
    void exceptionVasteWerknemerSchaalHogerNiveauException(){
        System.out.println("Methode Begonnen");
        try{
            Werkneembaar vasteWerknemer1 = new VasteWerknemer(1, "Sjoerd", 1);
            System.out.println("Try succesvol");
        }
        catch(OngeldigeSalarisSchaalException e){
            System.out.println("Ongeldige salarisschaal exception");
            throw new RuntimeException("Aanmaken Vaste Werknemer niet gelukt ivm ongeldigheid salarisschaal", e);
        }
        catch(Exception e){
            System.out.println("General exception");
        }
        System.out.println("Methode Afgerond");

    }

    @Test
    void printGesorteerdLijstje(){
        Werkneembaar vasteWerknemer1 = new VasteWerknemer(1, "Sjoerd", 1);
        Werkneembaar vasteWerknemer2 = new VasteWerknemer(2, "Da", 4);
        Werkneembaar vasteWerknemer3 = new VasteWerknemer(3, "Rein", 3);

        Werkneembaar tijdelijkeWerknemer1 = new TijdelijkeWerknemer(4, "Dannis", 40, 25);
        Werkneembaar tijdelijkeWerknemer2 = new TijdelijkeWerknemer(5, "Mike", 40, 22);
        Werkneembaar tijdelijkeWerknemer3 = new TijdelijkeWerknemer(6, "Daan", 40, 33);

        Werkneembaar[] lijstjeVanWerknemers = {vasteWerknemer1, tijdelijkeWerknemer1, vasteWerknemer3, vasteWerknemer2, tijdelijkeWerknemer2, tijdelijkeWerknemer3};

        System.out.println("Niet gesorteerd:");
        printLijstjeWerknemersNaamEnSalaris(lijstjeVanWerknemers);

        System.out.println(" ");
        Arrays.sort(lijstjeVanWerknemers, new WerknemerSalarisComparator());
        System.out.println(" ");

        System.out.println("Gesorteerd op salaris:");
        printLijstjeWerknemersNaamEnSalaris(lijstjeVanWerknemers);

        System.out.println(" ");
        Arrays.sort(lijstjeVanWerknemers, new WerknemerIDComparator());
        System.out.println(" ");

        System.out.println("Gesorteerd op id:");
        printLijstjeWerknemersNaamEnSalaris(lijstjeVanWerknemers);

        System.out.println(" ");
        Arrays.sort(lijstjeVanWerknemers, new WerknemerNaamComparator());
        System.out.println(" ");

        System.out.println("Gesorteerd op naam:");
        printLijstjeWerknemersNaamEnSalaris(lijstjeVanWerknemers);
    }


    void printLijstjeWerknemersNaamEnSalaris(Werkneembaar[] lijstjeVanWerknemers){
        for(Werkneembaar werkneembaar : lijstjeVanWerknemers){
            System.out.println(werkneembaar.getNaam() + "(id: " + werkneembaar.getId() + ") " + " verdient: " + werkneembaar.getSalaris());
        }
    }

    @Test
    void werknemersAanmaken(){
        Werknemer[] werknemers = maakAantalWerknemers();
        printWerknemersMetHunSalaris(werknemers);

    }

    void printWerknemersMetHunSalaris(Werknemer[] werknemers){
        for(Werknemer werknemer : werknemers){
            System.out.println(werknemer.toStringRepresentatie() + "; " + "Salaris = " + werknemer.getSalaris());
        }
    }

    Werknemer[] maakAantalWerknemers(){
        Werknemer vasteWerknemer1 = new VasteWerknemer(1, "Sjoerd", 6);
        Werknemer vasteWerknemer2 = new VasteWerknemer(2, "S", 4);
        Werknemer vasteWerknemer3 = new VasteWerknemer(3, "Sj", 3);

        Werknemer tijdelijkeWerknemer1 = new TijdelijkeWerknemer(1, "D", 40, 25);
        Werknemer tijdelijkeWerknemer2 = new TijdelijkeWerknemer(2, "Dd", 40, 22);
        Werknemer tijdelijkeWerknemer3 = new TijdelijkeWerknemer(3, "De", 40, 23);

        Werknemer[] werknemers = {vasteWerknemer1, vasteWerknemer2, vasteWerknemer3, tijdelijkeWerknemer1, tijdelijkeWerknemer2, tijdelijkeWerknemer3};
        return  werknemers;
    }


    @Test
    void equivalentieRelatie() {
        VasteWerknemer vw1 = new VasteWerknemer(1, "Jo", 10);
        VasteWerknemer vw2 = new VasteWerknemer(1, "Dave", 10);
        VasteWerknemer vw3 = new VasteWerknemer(1, "Dave", 10);

        //reflexiviteit
        if(vw1.equals(vw1) == true) {
            System.out.println("Reflexive");
        }
        else{
            System.out.println("Not Reflexive");
        }

        //symmetry
        if(vw1.equals(vw2) == true) {
            if(vw2.equals(vw1) == true){
                System.out.println("Symmetric");
            }
            else{
                System.out.println("Not symmetric");
            }
        }
        else{
            System.out.println("Kijk of juiste testwaardes gebruikt worden! Eerste object zou 'equal' moeten zijn aan het tweede object om de symmetrie te controleren.");
        }


        //transitivity
        if((vw1.equals(vw2) == true) && (vw2.equals(vw3) == true)) {
            if(vw1.equals(vw3) == true){
                System.out.println("Transitive");
            }
            else{
                System.out.println("Not transitive");
            }
        }
        else{
            System.out.println("Kijk of juiste testwaardes gebruikt worden!");
        }

        //consistent
        boolean equals = vw1.equals(vw2);

        boolean consistent = true;
        for(int i = 0; i < 50; i++){
            if(equals == true){
                if(vw1.equals(vw2) == false){
                    consistent = false;
                }
            }
            else{
                if(vw1.equals(vw2) == true){
                    consistent = false;
                }
            }
        }
        if(consistent == true){
            System.out.println("Consistent");
        }
        else{
            System.out.println("Not consistent");
        }

        //NonNull
        if(vw1.equals(null) == false){
            System.out.println("NonNull werkt goed");
        }

    }

}
