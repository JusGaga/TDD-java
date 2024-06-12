package Exercice4;

import org.example.exercice4.NotFoundException;
import org.example.exercice4.RechercheVille;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RechercheVilleTest {

    private RechercheVille rechercheVille;


    @BeforeEach
    public void setUp() {
        rechercheVille = new RechercheVille(Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
                "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York",
                "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"));
    }

    @Test
    public void testRechercheAvecMoinsDeDeuxCaracteres() {
        assertThrows(NotFoundException.class, () -> {
            rechercheVille.rechercher("A");
        });
    }

    @Test
    public void testRechercheAvecDebutDeNom() {
        List<String> result = rechercheVille.rechercher("Va");
        assertTrue(result.contains("Valence"));
        assertTrue(result.contains("Vancouver"));
    }

    @Test
    public void testRechercheInsensibleALaCasse() {
        List<String> result = rechercheVille.rechercher("va");
        assertTrue(result.contains("Valence"));
        assertTrue(result.contains("Vancouver"));
    }

    @Test
    public void testRechercheAvecPartieDeNom() {
        List<String> result = rechercheVille.rechercher("ape");
        assertTrue(result.contains("Budapest"));
    }
}
