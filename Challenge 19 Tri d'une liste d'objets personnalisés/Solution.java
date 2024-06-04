import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Classe représentant une personne avec un nom et un âge
class Personne {
    private String nom;
    private int age;

    // Constructeur pour initialiser une personne avec un nom et un âge
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode pour obtenir le nom de la personne
    public String getNom() {
        return nom;
    }

    // Méthode pour obtenir l'âge de la personne
    public int getAge() {
        return age;
    }

    // Méthode toString pour obtenir une représentation textuelle de l'objet Personne
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}

// Classe principale pour tester le tri d'objets personnalisés
public class Solution {
    public static void main(String[] args) {
        
        
        // Création d'une liste de personnes
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Alice", 25));
        personnes.add(new Personne("Bob", 30));
        personnes.add(new Personne("Charlie", 20));

        // Affichage de la liste avant le tri
        System.out.println("Liste avant le tri :");
        for (Personne personne : personnes) {
            System.out.println(personne);
        }

        // Tri de la liste de personnes en fonction de l'âge à l'aide d'un comparateur
        Collections.sort(personnes, Comparator.comparingInt(Personne::getAge));

        // Affichage de la liste après le tri par âge
        System.out.println("\nListe après le tri par âge :");
        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }
}