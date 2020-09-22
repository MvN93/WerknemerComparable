package org.example.mike.overervenWerkNemers;


import org.example.mike.overervenWerkNemers.app.domain.TijdelijkeWerknemer;
import org.example.mike.overervenWerkNemers.app.domain.VasteWerknemer;
import org.junit.jupiter.api.Test;

public class overervenTests {

    @Test
    void werknemersAanmaken(){
        VasteWerknemer vasteWerknemer1 = new VasteWerknemer(1, "Sjoerd", 6);
        VasteWerknemer vasteWerknemer2 = new VasteWerknemer(2, "S", 4);
        VasteWerknemer vasteWerknemer3 = new VasteWerknemer(3, "Sj", 8);

        TijdelijkeWerknemer tijdelijkeWerknemer1 = new TijdelijkeWerknemer(1, "D", 40, 25);
        TijdelijkeWerknemer tijdelijkeWerknemer2 = new TijdelijkeWerknemer(2, "Dd", 40, 22);
        TijdelijkeWerknemer tijdelijkeWerknemer3 = new TijdelijkeWerknemer(3, "De", 40, 23);
    }

}
