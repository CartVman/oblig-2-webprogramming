package com.example.oblig2webprogramming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BestillingController {
    private final ArrayList<Bestilling> bestillingList = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagre(Bestilling billett) {
        if (billett.getAntall() > 0 && billett.getFornavn().length() > 0 && billett.getEtternavn().length() > 0
                && billett.getTelefonnr().length() > 0 && billett.getEpost().length() > 0) {
            if (billett.getFilm().equals("Spiderman") || billett.getFilm().equals("Superman") || billett.getFilm().equals("Batman")) {
                bestillingList.add(billett);
            }
        }
    }

    @GetMapping("/hentAlle")
    public List<Bestilling> hentAlle() {
        return bestillingList;
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        bestillingList.clear();
    }
}

