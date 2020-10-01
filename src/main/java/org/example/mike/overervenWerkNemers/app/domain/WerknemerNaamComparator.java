package org.example.mike.overervenWerkNemers.app.domain;

import java.util.Comparator;

public class WerknemerNaamComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Werkneembaar thisWerknemer = (Werkneembaar) o1;
        Werkneembaar otherWerknemer = (Werkneembaar) o2;

        int letterDifference = 0;
        int letterIndex = 0;

        String strin;

        while((letterDifference == 0) && (letterIndex <= 15)) {

            //zodat we geen exception krijgen van het vergelijken van kortere en langere namen
            if(letterIndex < thisWerknemer.getNaam().length() && letterIndex < otherWerknemer.getNaam().length()){

                //see if the letter at current index is different, starts at 0
                letterDifference = thisWerknemer.getNaam().charAt(letterIndex) - otherWerknemer.getNaam().charAt(letterIndex);

                //if not the same same give either negative or positive number to ordering
                if(!(letterDifference == 0)){
                    return letterDifference;}

                //if same check next letter
                else{
                    letterIndex = letterIndex + 1;
                }
            }
            else if((letterIndex < thisWerknemer.getNaam().length()) && !(letterIndex < otherWerknemer.getNaam().length())){
                return 1; //kortere naam (van otherWerknemer) komt dan eerder te staan (want letterindex is nog kleiner dan lengte van this)
            }
            else if(!(letterIndex < thisWerknemer.getNaam().length()) && (letterIndex < otherWerknemer.getNaam().length())){
                return -1; //kortere naam (van this) komt dan eerder te staan
            }
            else{return 0;}
        }
        return letterDifference;
    }


}
