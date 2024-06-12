package org.example.exercice4;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RechercheVille {

    private List<String> villes;

    public RechercheVille(List<String> villes) {
        this.villes = villes;
    }

    public List<String> rechercher(String mot) {
        if (mot.length() < 2 && !mot.equals("*")){
            throw new NotFoundException("Le texte de recherche doit contenir au moins 2 caractères.");
        }

        if (mot.equals("*")) {
            return new ArrayList<>(villes);
        }

        String recherche = mot.toLowerCase();

        return villes.stream()
                .filter(ville -> ville.toLowerCase().startsWith(recherche)|| ville.toLowerCase().contains(recherche))
                .collect(Collectors.toList());

    }
}
