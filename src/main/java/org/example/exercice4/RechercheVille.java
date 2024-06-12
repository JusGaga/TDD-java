package org.example.exercice4;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class RechercheVille {

    private List<String> villes;

    public RechercheVille(List<String> villes) {
        this.villes = villes;
    }

    public List<String> rechercher(String mot) throws ExecutionControl.NotImplementedException {
        if (mot.length() < 2){
            throw new NotFoundException("Le texte de recherche doit contenir au moins 2 caractères.");
        }
        throw new ExecutionControl.NotImplementedException("");
    }
}
