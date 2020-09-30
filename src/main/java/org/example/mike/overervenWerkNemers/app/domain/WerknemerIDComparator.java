package org.example.mike.overervenWerkNemers.app.domain;

import java.util.Comparator;

public class WerknemerIDComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Werkneembaar thisWerknemer = (Werkneembaar) o1;
        Werkneembaar otherWerknemer = (Werkneembaar) o2;
        return thisWerknemer.getId() - otherWerknemer.getId();
    }
}
